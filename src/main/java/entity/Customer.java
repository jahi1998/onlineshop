/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

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
	* @Title: logOn  
	* @Description: ע��  
	* @param @param parm
	* @param @return    ����  
	* @return boolean    ע��ɹ�����true
	* @throws  
	*/  
	public boolean logOn(String[] parm) {
		
		return true;
		
	}
	
	
	
	
	
	/**  
	* @Title: searchTrollry  
	* @Description: ���û��򿪹��ﳵ����ʱ���ô˺������˺���û�в�������ΪĬ���õ�ǰcustomer��id ,�����ǲ�Ʒ��Ϣ��ֵ�����Ƕ�Ӧ����
	* @param @return    ����  
	* @return Product[]    ��������  
	* @throws  
	*/  
	public Map<Product, Integer> searchTrolley() {
		
		return null;
	}
	
	
	/**  
	* @Title: deleteTrolleyProduct  
	* @Description: ���ݲ����еĲ�Ʒidɾ�����ﳵ�еĶ�Ӧ��Ʒ  
	* @param @param proId
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean deleteTrolleyProduct(int proId) {
		
		return true;
	}
	
	/**  
	* @Title: modifyTrolleyProduct  
	* @Description:  ���ݵ�һ��������proId�޸����ݿ��Ӧ�����ݣ��ڶ���������ʾ��һ���Ǽ�һ
	* @param @param proId
	* @param @param num
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean modifyTrolleyProduct(int proId,int operate) {
		
		return true;
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
	public Order[] searchOrder() {
		
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
