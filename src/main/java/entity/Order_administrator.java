/**  
* @Title: Order_administrator.java  
* @Package entity  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author WenbinYu  
* @date 2019��3��19��  
* @version V1.0  
*/ 

package entity;

import java.sql.SQLException;

/**  
* @ClassName: Order_administrator  
* @Description: TODO(������һ�仰��������������)  
* @author WenbinYu  
* @date 2019��3��19��  
*    
*/
public class Order_administrator extends Admin {
	
	
	
	/**  
	* ����һ���µ�ʵ�� Order_administrator.  
	*    
	*/
	public Order_administrator(Admin admin) {
		// TODO �Զ����ɵĹ��캯�����
		this.setId(admin.getId());
		this.setName(admin.getName());
		this.setPasswd(admin.getPasswd());
		this.setState(Admin.order_adm);
		
	}
	
	
	/**  
	* ����һ���µ�ʵ�� Order_administrator.  
	*    
	*/
	public Order_administrator() {
		// TODO �Զ����ɵĹ��캯�����
		
	}
	
	/**
	 * @throws SQLException   
	* @Title: print  
	* @Description: ��ӡ����δ�����Ķ�����Ϣ ,��ӡ�����������Դ˺�����Ҫ������״̬��Ϊ�ѷ���(δ�ջ�)
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean print() throws SQLException {
		String sql = "UPDATE `orders` SET `state`='"+Order.NR_unCollected+"' WHERE (`state`='"+Order.NR_waitForReceiving+"')";
		int line = Database.executeUpdate(sql);
		if (line>0) {
			Database.closeConnection();
			return true;
		}
		Database.closeConnection();
		return false;
		
	}

	/**
	* <p>Title: search</p>  
	* <p>Description: </p>  
	* @param state
	* @return  
	* @see entity.User#search(int)  
	*/ 
	@Deprecated
	@Override
	public Order[] search(int state) {
		// TODO �Զ����ɵķ������
		return super.search(state);
	}

}
