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
	* ����һ���µ�ʵ�� Product_administrator.  
	*    
	*/
	public Product_administrator() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**  
	* ����һ���µ�ʵ�� Product_administrator.  
	*    
	*/
	public Product_administrator(Admin admin) {
		// TODO Auto-generated constructor stub
		this.setId(admin.getId());
		this.setName(admin.getName());
		this.setPasswd(admin.getPasswd());
		this.setState(Admin.product_adm);
	}
	
	/**
	 * @throws SQLException   
	* @Title: addProduct  
	* @Description: �½�һ����Ʒ  
	* @param @param product
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean addProduct(Product product) throws SQLException {
		//TODO
		String sql = "INSERT INTO `product` (`price`, `name`, `image1`, `image2`, `image3`, `image4`, `image5`, `image6`, `image7`, `description1`, `description2`, `description3`, `description4`, `description5`, `description6`, `group`, `memory`, `pixel`, `battery`, `processor`) VALUES ( '"+product.getPrice()+"', '"+product.getName()+"', '"+product.getImages()[0]+"', '"+product.getImages()[1]+"', '"+product.getImages()[2]+"', '"+product.getImages()[3]+"', '"+product.getImages()[4]+"', '"+product.getImages()[5]+"', '"+product.getImages()[6]+"', '"+product.getDescription()[0]+"', '"+product.getDescription()[1]+"', '"+product.getDescription()[2]+"', '"+product.getDescription()[3]+"', '"+product.getDescription()[4]+"', '"+product.getDescription()[5]+"', '"+product.getGroup()+"', '"+product.getMemory()+"', '"+product.getPixel()+"', '"+product.getBattery()+"', '"+product.getProcessor()+"');";
		int state = Database.executeUpdate(sql);
		if (state ==1) {
			Database.closeConnection();
			return true;
		}
		Database.closeConnection();
		return false;
	}
	
	/**
	 * @throws SQLException   
	* @Title: rmProduct  
	* @Description: ɾ�������е�product
	* @param @param product
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean rmProduct(Product product) throws SQLException {
		//TODO
		String sql = "delete from product where product_id = "+product.getId();
		int state = Database.executeUpdate(sql);
		if (state==1) {
			Database.closeConnection();
			return true;
		}
		Database.closeConnection();
		return false;
	}
	


	
	/**
	 * �޸Ĳ�Ʒ��Ϣ
	 * ���������������������������������������������˺��������д���
	 * @throws SQLException 
	 * */
	public boolean modifyProductInfo(Product product) throws SQLException {
		//TODO
		String sql = "UPDATE `product` SET '"+product.getPrice()+"', '"+product.getName()+"', '"+product.getImages()[0]+"', '"+product.getImages()[1]+"', '"+product.getImages()[2]+"', '"+product.getImages()[3]+"', '"+product.getImages()[4]+"', '"+product.getImages()[5]+"', '"+product.getImages()[6]+"', '"+product.getDescription()[0]+"', '"+product.getDescription()[1]+"', '"+product.getDescription()[2]+"', '"+product.getDescription()[3]+"', '"+product.getDescription()[4]+"', '"+product.getDescription()[5]+"', '"+product.getGroup()+"', '"+product.getMemory()+"', '"+product.getPixel()+"', '"+product.getBattery()+"', '"+product.getProcessor()+"' WHERE (`product_id`='"+product.getId()+"');";
		int state = Database.executeUpdate(sql);
		if (state==1) {
			Database.closeConnection();
			return true;
		}
		Database.closeConnection();
		return false;
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
