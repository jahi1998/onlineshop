/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;


/**
 * @author YWB
 *
 */
public class Order {
	private String id;
	private String customerId;
	
	private int price;
	private int productId;
	private int state;
	
	/**  
	* @Fields field:field:δ����  
	*/ 
	final static int NR_waitForReceiving 	= 0;
	
	/**  
	* @Fields field:field:δ�ջ�  
	*/ 
	final static int NR_unCollected 		= 1;

	/**  
	* @Fields field:field:���ջ�,��״̬�¿��������ۺ�(��״̬��δ�ջ�״̬����7���Զ��ı����),�����ۺ�����δʵ��  
	*/ 
	final static int NR_Collected 			= 2;

	/**  
	* @Fields field:field:�ȴ����  
	*/ 
	final static int NR_waitForReview 		= 3;

	/**  
	* @Fields field:field:���ҵȴ�����˻� 
	*/ 
	final static int NR_waitForReturn 		= 4;

	/**  
	* @Fields field:field:�˻����  
	*/ 
	final static int NR_returnedFinish 		= 5;

	/**  
	* @Fields field:field:���δͨ�� 
	*/ 
	final static int NR_reviewNotPass 		= 6;
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
	 * @return orderNo
	 */
	/**
	 * @return customer
	 */
	public String getCustomer() {
		return customerId;
	}
	/**
	 * @param customer Ҫ���õ� customer
	 */
	public void setCustomer(String customer) {
		this.customerId = customer;
	}
	/**
	 * @return totalPrice
	 */
	public int getTotalPrice() {
		return price;
	}
	/**
	 * @param totalPrice Ҫ���õ� totalPrice
	 */
	public void setTotalPrice(int totalPrice) {
		this.price = totalPrice;
	}
	/**
	 * @return amount
	 */
	/**
	 * @return state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state Ҫ���õ� state
	 */
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * ������״̬ת��ΪNotDelivered
	 * */
	public boolean orderNotDelivered() {
		
		//TODO
		
		return true;
	}
	
	/**
	 * ������״̬��ΪunCollected
	 * */
	public boolean orderUnCollected() {
		//TODO
		return true;
	}
	
	/**
	 * ������״̬��ΪFinish
	 * */
	public boolean orderFinish() {
		//TODO
		return true;
	}
	/**
	 * ������״̬��ΪReturning
	 * 
	 * */
	public boolean orderReturning() {
		//TODO
		return true;
	}
	/**
	 * ������״̬��ΪReturned
	 * 
	 * */
	public boolean orderReturned() {
		//TODO
		return true;
	}
	/**
	 * @return product
	 */
	public int getProduct() {
		return productId;
	}
	/**
	 * @param product Ҫ���õ� product
	 */
	public void setProduct(int product) {
		this.productId = product;
	}
	
	
	

}
