/**  
* @Title: User.java  
* @Package entity  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author WenbinYu  
* @date 2019��3��15��  
* @version V1.0  
*/ 

package entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**  
* @ClassName: User  
* @Description: TODO(������һ�仰��������������)  
* @author WenbinYu  
* @date 2019��3��15��  
*    
*/
public class User {
	private String passwd;
	private String id;
	private String name;
	
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return passwd
	 */
	public String getPasswd() {
		return passwd;
	}
	/**
	 * @param passwd Ҫ���õ� passwd
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param user �����½�ߵ���Ϣ
	 * @return �û���Ϣ���ڣ������û���Ϣ������weinull
	 * user.name�д洢�����û���𣬴˴���Ҫ�����name��ֵѡ���ѯ���ű�
	 * @throws SQLException 
	 * */
	public User logIn(User user) throws SQLException {
		Connection connection = Database.getConnection();
		if (user.getName().equals("customer")) {
			
		String sql = "select * from customer where customer_id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, user.getId());
		ResultSet rs = statement.executeQuery();
		if(rs.next()) {
			Customer customer = new Customer();
			Address[] addresses = new Address[3];
			addresses[0] = new Address(rs.getString("addr1"));
			addresses[1] = new Address(rs.getString("addr2"));
			addresses[2] = new Address(rs.getString("addr3"));
			
			customer.setId(rs.getString("customer_id"));
			customer.setName(rs.getString("name"));
			customer.setAddr(addresses);
			customer.setPasswd(rs.getString("passwd"));
			return customer;
		}
		return null;
		} else {
			
			String sql = "select * from admin where admin_id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, user.getId());
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				Admin admin = new Admin();
				admin.setId(rs.getString("admin_id"));
				admin.setName(rs.getString("name"));
				admin.setState(rs.getInt("position"));
				admin.setPasswd(rs.getString("passwd"));
				return admin;
			}
			return null;
			
		}
	}
	
	
	/**  
	* @Title: search  
	* @Description: ��ѯ�����и�����״̬�Ĳ�Ʒ��Ϣ 
	* @param @param state
	* @param @return    ����  
	* @return Product[]    ��������  
	* @throws  
	*/  
	public Order[] searchOrder(int state) {
		return null;
	}
	
	
	/**  
	* @Title: search  
	* @Description: �˺������ڲ�ѯ�ֻ�������Ϊ�ؼ������Ϊ���򷵻������ֻ���Ϣ  
	* @param @param string
	* @param @return    ����  
	* @return Product[]    ��������  
	* @throws  
	*/  
	public Product[] searchProduct(String phoneName) {
		
		return null;
	}

}
