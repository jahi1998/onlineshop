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
public class Product_administrator extends Admin {
	
	/**  
	* @Title: addProduct  
	* @Description: �½�һ����Ʒ  
	* @param @param product
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean addProduct(Product product) {
		//TODO
		return true;
	}
	
	/**  
	* @Title: rmProduct  
	* @Description: ɾ�������е�product
	* @param @param product
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean rmProduct(Product product) {
		//TODO
		return true;
	}
	


	
	/**
	 * �޸Ĳ�Ʒ��Ϣ
	 * */
	public boolean modifyProductInfo(Product product) {
		//TODO
		
		return true;
	}
	/**
	* <p>Title: searchProduct</p>  
	* <p>Description: </p>  
	* @param phoneName
	* @return  
	* @see entity.User#searchProduct(java.lang.String)  
	*/ 
	@Override
	public Product[] searchProduct(String phoneName) {
		// TODO �Զ����ɵķ������
		return super.searchProduct(phoneName);
	}
	
	

}
