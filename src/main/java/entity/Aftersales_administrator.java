/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.sql.SQLException;
import static entity.Order.*;
/**  
* @ClassName: Aftersales_administrator  
* @Description: TODO(������һ�仰��������������)  
* @author WenbinYu  
* @date 2019��3��19��  
*    
*/ 
public class Aftersales_administrator extends Admin{


	
	/**
	 * @throws SQLException   
	* @Title: verify  
	* @Description: ����ͬ����߾ܾ��ͻ����ۺ�����  ��true��ʾͬ�⣬false��ʾ��ͬ�⣬ͬ�⽫����״̬��Ϊ�ȴ��˻�����ͬ���Ϊ���δͨ��
	* @param @param agrNage
	* @param @param o
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean verify(boolean agrNage,Order o) throws SQLException {
		//TODO
		String sql;

		if (agrNage) {
			sql = "UPDATE `orders` set state = "+NR_waitForReturn+" where order_id = "+o.getId();
		} else {
			sql = "UPDATE `orders` set state = "+NR_reviewNotPass+" where order_id = "+o.getId();
		}
		int line = Database.executeUpdate(sql);
		if (line==1) {
			
			Database.closeConnection();
			return true;
		}
		Database.closeConnection();
		return false;
		
	}

	/**
	* <p>Title: searchOrder</p>  
	* <p>Description: </p>  
	* @param state
	* @return  
	 * @throws SQLException 
	* @see entity.Admin#searchOrder(int)  
	* ��������״̬Ϊ�ȴ���˵Ķ���
	*/ 
	@Override
	public Order[] searchOrder(int state) throws SQLException {
		// TODO �Զ����ɵķ������
		return super.searchOrder(state);
	}
	

}
