/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author YWB
 *
 */
public class Customer extends User{
	private boolean sex;
	private Address[] addr;
	private Product[] products;
	private Order[] orders;
	/**  
	* ����һ���µ�ʵ�� Customer.  
	*    
	*/
	public Customer() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	/**
	 * @return sex
	 */
	public boolean isSex() {
		return sex;
	}
	/**
	 * @param sex Ҫ���õ� sex
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	/**
	 * @return addr
	 */
	public Address[] getAddr() {
		return addr;
	}
	/**
	 * @param addr Ҫ���õ� addr
	 */
	public void setAddr(Address[] addr) {
		this.addr = addr;
	}
	/**
	 * @return products
	 */
	public Product[] getProducts() {
		return products;
	}
	/**
	 * @param products Ҫ���õ� products
	 */
	public void setProducts(Product[] products) {
		this.products = products;
	}
	/**
	 * @return orders
	 */
	public Order[] getOrders() {
		return orders;
	}
	/**
	 * @param orders Ҫ���õ� orders
	 */
	public void setOrders(Order[] orders) {
		this.orders = orders;
	}
	
	
	/**
	 * @throws SQLException   
	* @Title: logOn  
	* @Description: ע��  
	* @param @param parm
	* @param @return    ����  
	* @return boolean    ע��ɹ�����true
	* @throws  
	*/  
	public boolean logOn(String[] parm) throws SQLException {
		String sql2 = "select * from customer where customer_id = '"+parm[1]+"'";
		ResultSet resultSet = Database.executeQuery(sql2);
		if (resultSet.next()) {
			return false;
		} else {

			String sql = "insert into customer values ('"+parm[1]+"','"+parm[0]+"','"+parm[2]+"')";
			int column = Database.executeUpdate(sql);
			if (column==1) {
				return true;
			} else {
				return false;
			}
		}
		
		
	}
	
	
	
	
	
	/**
	 * @throws IOException 
	 * @throws SQLException   
	* @Title: searchTrollry  
	* @Description: ���û��򿪹��ﳵ����ʱ���ô˺����� ,�����ǲ�Ʒ��Ϣ��ֵ�����Ƕ�Ӧ����
	* @param @return    ����  
	* @return Product[]    ��������  
	* @throws  
	*/  
	public Map<Product, Integer> searchTrolley(Customer customer) throws SQLException, IOException {
		String sql = "SELECT * FROM (SELECT product.*,amount,customer_id FROM product LEFT JOIN trolley ON product.product_id=trolley.product_id ) AS a WHERE customer_id = '"+customer.getId()+"'";
		ResultSet resultSet = Database.executeQuery(sql);
		Map<Product, Integer> map = new HashMap<Product, Integer>();
		while (resultSet.next()) {
			map.put(new Product(resultSet.getInt("product_id"),resultSet.getDouble("price"),
					resultSet.getString("name"),resultSet.getString("image1"),
					resultSet.getString("image2"),resultSet.getString("image3"),
					resultSet.getString("image4"),resultSet.getString("image5"),
					resultSet.getString("image6"),resultSet.getString("image7"),resultSet.getString("description1"),
					resultSet.getString("description2"),resultSet.getString("description3"),
					resultSet.getString("description4"),resultSet.getString("description5"),
					resultSet.getString("description6"),resultSet.getString("group"),
					resultSet.getInt("memory"),resultSet.getInt("pixel"),
					resultSet.getInt("battery"),resultSet.getString("processor")), resultSet.getInt("amount"));
		}
		
		return map;
	}
	
	
	/**
	 * @throws SQLException   
	* @Title: deleteTrolleyProduct  
	* @Description: ���ݲ����еĲ�Ʒidɾ�����ﳵ�еĶ�Ӧ��Ʒ  
	* @param @param proId
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean deleteTrolleyProduct(int proId,Customer customer) throws SQLException {
		String sql = "delete from trolley where product_id = "+proId+"and customer_id = '"+customer.getId()+"'";
		int num = Database.executeUpdate(sql);
		if (num>0) {
			return true;
			
		} else {
			return false;
		}
	}
	
	/**
	 * @throws SQLException   
	* @Title: modifyTrolleyProduct  
	* @Description:  ���ݵ�һ��������proId�޸����ݿ��Ӧ�����ݣ��ڶ���������ʾ��һ���Ǽ�һ
	* @param @param proId
	* @param @param num
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean modifyTrolleyProduct(int proId,int operate) throws SQLException {
		
		String sql = "update trolley set amount = amount "+operate+" where product_id = "+proId+"";
		int line = Database.executeUpdate(sql);
		if (line==1) {
			
			return true;
		}
		return false;
	}
	
	
	
	/**  
	* @Title: addProduct2Trolley  
	* @Description: �˺��������鷳��������������д����Ҫ֮ʱ��������β���
	* 				�Ȳ�ѯ���ݿ⹺�ﳵ���Ƿ����뵱ǰ�ͻ�id�Լ���ƷId��Ӧ�ļ�¼������У����޸�����
	* 				���û�У������һ����¼ 
	* @param @param proId
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean addProduct2Trolley(int proId) {
		
		return true;
	}
	
	
	/**  
	* @Title: pay  
	* @Description: �˺���Ϊ���������Ӧ�õ���֧�����ӿڣ��˴����������ϣ�����ֻ��Ҫ�޸���Ӷ������ɣ�
	* 				��Ҫ˵�����ǣ�������ͬһ����Ʒ���ֵĴ�����ʾ�û����������  
	* 				!!!�˴���ǿ��˵����pay������ʼ�������жϵ�ǰ�ͻ���û�����õ�ַ
	* 				������ǿ��˵�����˺����뽫����״̬��Ϊ������
	* 				�˴��뽫�����д���ļ�����Ʒ����ɼ���������������Ϣ�������ݿ�
	* @param @param products
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean pay(Product[] products) {
		
		return true;
	}
	
	
	
	/**  
	* @Title: searchOrder  
	* @Description: �˺������ڲ�ѯ��ǰ�ͻ������ж���  
	* @param @return    ����  
	* @return Order[]    ��������  
	* @throws  
	*/  
	public Order[] searchOrder(Customer customer) {
		
		return null;
	}
	
	
	/**  
	* @Title: searchOrder  
	* @Description: �˺������ݲ���state���ض�Ӧ��order
	* @param @param state
	* @param @return    ����  
	* @return Order[]    ��������  
	* @throws  
	*/  
	public Order[] searchOrder(Order[] orders,int state) {
		
		return null;
	}
	
	
	/**  
	* @Title: modifyPasswd  
	* @Description: �޸ĵ�ǰ�ͻ������� 
	* @param @param oldPasswd
	* @param @param newPasswd
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean modifyPasswd(String oldPasswd,String newPasswd) {
		
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
