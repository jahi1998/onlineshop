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
public class Admin extends User{
	private int position;
	public final static int finance_adm = 1;
	public final static int aftersale_adm = 2;
	public final static int root_adm = 3;
	public final static int product_adm = 4;
	public final static int order_adm = 5;
	/**  
	* @Title: searchProduct  
	* @Description: TODO(������һ�仰�����������������)  
	* @param @param phoneName
	* @param @return    ����  
	* @return Product []    ��������  
	* @throws  
	*/  
	public Product[] searchProduct(String phoneName) {
		
		// TODO �Զ����ɵķ������
		return null;
	}
	/**  
	* @Title: searchOrder  
	* @Description: TODO(������һ�仰�����������������)  
	* @param @param state
	* @param @return    ����  
	* @return Order []    ��������  
	* @throws  
	*/  
	public Order[] searchOrder(int state) {
		// TODO �Զ����ɵķ������
		return null;
	}
	/**  
	* @Title: search  
	* @Description: TODO(������һ�仰�����������������)  
	* @param @param state
	* @param @return    ����  
	* @return Order []    ��������  
	* @throws  
	*/  
	public Order[] search(int state) {
		// TODO �Զ����ɵķ������
		return null;
	}
	/**
	 * @return state
	 */
	public int getState() {
		return position;
	}
	/**
	 * @param state Ҫ���õ� state
	 */
	public void setState(int state) {
		this.position = state;
	}

}
