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
		String sql = "UPDATE `order` SET `state`='"+Order.NR_waitForReceiving+"' WHERE (`state`='"+Order.NR_waitForReceiving+"')";
		int line = Database.executeUpdate(sql);
		if (line>0) {
			return true;
		}
		return false;
		
	}

	/**
	* <p>Title: search</p>  
	* <p>Description: </p>  
	* @param state
	* @return  
	* @see entity.User#search(int)  
	*/ 
	@Override
	public Order[] search(int state) {
		// TODO �Զ����ɵķ������
		return super.search(state);
	}

}
