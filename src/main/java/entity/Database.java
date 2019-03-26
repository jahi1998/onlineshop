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
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            return  connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        
    }
    public static void closeConnection(Connection connection){
	try {
		
		
		if(connection!=null)connection.close();
	} catch (Exception e) {
		e.fillInStackTrace();
	}
}
    public static Connection opendb(){
        
        try {
            Connection connection = Database.getConnection();
            
            System.out.println("���ݿ����ӳɹ�");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
    Connection connection = opendb();
    System.out.println(connection);
}

}


