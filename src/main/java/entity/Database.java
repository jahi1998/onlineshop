/**  
* @Title: Database.java  
* @Package entity  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author WenbinYu  
* @date 2019��3��22��  
* @version V1.0  
*/ 

package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**  
* @ClassName: Database  
* @Description: TODO(������һ�仰��������������)  
* @author WenbinYu  
* @date 2019��3��22��  
*    
*/
public class Database {
	//?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false
    private static final  String url = "jdbc:mysql://39.105.17.254:3306/onlineshop?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false";
private static final  String username = "root";
private static final  String password = "root";
private static Connection connection;
private static PreparedStatement statement;
private static java.sql.CallableStatement callableStatement;
    public static void getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        
    }
    public static void closeConnection(){
	try {
		
		
		if(connection!=null)connection.close();
		if (statement!=null) {
			statement.close();
		}
		if(callableStatement!=null)callableStatement.close();
	} catch (Exception e) {
		e.fillInStackTrace();
	}
}
    /**  
    * @Title: executeQuery  
    * @Description: ��װ��jdbc�Ķ�Ӧ����  
    * @param @param connection
    * @param @param sql
    * @param @return
    * @param @throws SQLException    ����  
    * @return ResultSet    ��������  
    * @throws  
    */  
    private static ResultSet executeQuery(Connection connection,String sql) throws SQLException {
    	statement = connection.prepareStatement(sql);
    	ResultSet resultSet = statement.executeQuery();
    	return resultSet;
    }
    
    
    private static boolean callableExecute(Connection connection,String callName) throws SQLException {
    	callableStatement = connection.prepareCall(callName);
		return callableStatement.execute();
    }
    
    public static boolean callableExecute(String callName) throws SQLException {
		getConnection();
		return callableExecute(connection, callName);
	}
     
    private static int executeUpdate(Connection connection,String sql) throws SQLException {
    	statement = connection.prepareStatement(sql);
    	int influenceLine = statement.executeUpdate();
    	return influenceLine;
    }
    
    /**  
     * @Title: executeUpdate  
     * @Description: ��װ��jdbc��Ӧ�ķ���  
     * @param @param connection
     * @param @param sql
     * @param @return
     * @param @throws SQLException    ����  
     * @return int    ��������  
     * @throws  
     */ 
    public static int executeUpdate(String sql) throws SQLException {
    	getConnection();
    	return executeUpdate(connection, sql);
    }
    
    /**  
     * @Title: executeQuery  
     * @Description: ��װ��jdbc�Ķ�Ӧ����  
     * @param @param connection
     * @param @param sql
     * @param @return
     * @param @throws SQLException    ����  
     * @return ResultSet    ��������  
     * @throws  
     */ 
    public static ResultSet executeQuery(String sql) throws SQLException {
    	getConnection();
    	return executeQuery(connection, sql);
    }

}


