/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author YWB
 *
 */
public class Finance_administrator extends Admin implements FindOrder{

	/* ���� Javadoc��
	 * @see entity.FindOrder#findOrder(entity.Customer)
	 */
	public Order[] findOrder(Customer whos) {
		// TODO �Զ����ɵķ������
		return null;
	}

	/* ���� Javadoc��
	 * @see entity.FindOrder#findOrderUsingState(int)
	 */
	public Order[] findOrderUsingState(int state) {
		// TODO �Զ����ɵķ������
		return null;
	}

	/* ���� Javadoc��
	 * @see entity.FindOrder#findOrderUsingId(int)
	 */
	public Order[] findOrderUsingId(int id) {
		// TODO �Զ����ɵķ������
		return null;
	}
	
	public boolean received(int orderId) {
		//TODO
		return true;
	}

	/**
	* <p>Title: searchOrder</p>  
	* <p>Description: </p>  
	* @param state
	* @return  
	 * @throws SQLException 
	* @see entity.User#searchOrder(int)  
	*/ 
	@Override
	public Order[] searchOrder(int state) throws SQLException {
		// TODO �Զ����ɵķ������
		return super.searchOrder(state);
	}
	
	
	/**  
	* @Title: searchOrder  
	* @Description: ����id���ض�Ӧ�Ķ��� 
	* @param @param orderId
	* @param @return    ����  
	* @return Order    ��������  
	* @throws  
	*/  
	public Order searchOrder(String orderId)  throws SQLException {
		String sql = "SELECT * FROM order where order_id = '"+orderId+"'";
		ResultSet resultSet = Database.executeQuery(sql);
		if(resultSet.next()) {
			Order order = new Order(resultSet.getString("id"),resultSet.getString("customerId"),resultSet.getInt("price"),resultSet.getInt("productId"),resultSet.getInt("state"));
			return order;
		}
		return null;
	}
	
	

}
