/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * @author YWB
 *
 */
public class Root extends Admin {
	public Admin[] admins;
	/**  
	* ����һ���µ�ʵ�� Root.  
	 * @throws SQLException 
	*    
	*/
	public Root() throws SQLException {
		admins = findAdmin();
	}
	
	
	
	/**
	 * @throws SQLException   
	* @Title: findAdmin  
	* @Description: ��ѯ����Ա��Ϣ
	* @param @param admin
	* @param @return    ����  
	* @return Admin[]    ��������  
	* @throws  
	*/  
	public Admin[] findAdmin() throws SQLException {
		String sqlString = " select * from admin ";
		ResultSet re= Database.executeQuery(sqlString);
		 List<Admin> ad = new ArrayList<Admin>();
		 while(re.next()) {
			 ad.add(new Admin(re.getString("admin_id"),re.getInt("position"),re.getString("name"),re.getString("passwd")));
		 }	
		 Admin[] a = new Admin[ad.size()] ;
		 for(int i=0; i<ad.size();i++) {
			 a[i]=ad.get(i);
		 }
		Database.closeConnection();
		return a;
	}
	
	/**
	 * @throws SQLException   
	* @Title: deleteAdmin  
	* @Description: ɾ�������е�admin
	* @param @param admin
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean deleteAdmin(Admin admin) throws SQLException {
		String sqlString = " delete * from admin where admin_id = '"+ admin.getId()+"'";
		int s= Database.executeUpdate(sqlString);
		if (s==0) {
			Database.closeConnection();
			return false;
			
		}
		Database.closeConnection();
		return true;
	}
	
	
	/**  
	* @Title: addAdmin  
	* @Description: �˺������������ã��������ݿ���һ�β�ѯ������鵽�й���Ա�����޸���Ϣ�����û��������һ����¼  
	* @param @param admin
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean addAdmin(Admin admin) throws SQLException{
		
		String sqlString = " select * from admin where admin_id = '"+ admin.getId()+"'";
		ResultSet re= Database.executeQuery(sqlString);
		if(re.next()) {
			String sq = "Update admin set admin_id = '" + admin.getId() + "',position=" + admin.getState() + ",name='" + admin.getName() + "',passwd='"+admin.getPasswd()+"'";
			int rs= Database.executeUpdate(sq);
			if(rs==0) {
				Database.closeConnection();
				return false;
			}
			else {
				Database.closeConnection();
				return true;}
		}
		else {
			String a =" Insert INTO admin (admin_id, position, name, passwd) VALUES ('"+admin.getId()+"',"+admin.getState()+",'"+admin.getName()+"','"+admin.getPasswd()+"')";
			int r= Database.executeUpdate(a);
			if(r==0) {
				Database.closeConnection();
				return false;
			}
			else {
				Database.closeConnection();
				return true;}
		}
		
	
		
	}
	

}
