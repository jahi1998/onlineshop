/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.io.IOException;
import java.sql.SQLException;

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
	 * @throws IOException 
	 * @throws SQLException 
	* @see entity.User#searchProduct(java.lang.String)  
	*/ 
	@Override
	public Product[] searchProduct(String phoneName) throws SQLException, IOException {
		// TODO �Զ����ɵķ������
		return super.searchProduct(phoneName);
	}
	
	

}
