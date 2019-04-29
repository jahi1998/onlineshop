/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.exception.ProdutNotFoundException;

/**
 * @author YWB
 *
 */
public class Product {
	
	public Product(int id) {
		
		
		this.id = id;
		
		String sqlString = "select name,price from product where product_id = "+id;
		try {
			ResultSet resultSet = Database.executeQuery(sqlString);
			if(resultSet.next())
			{
				this.name = resultSet.getString("name");
				this.price = resultSet.getInt("price");
			}
			else {
				throw new ProdutNotFoundException("�˲�Ʒ������");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProdutNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private int id;
	private int price;
	private String name;
	
	/**  
	* @Fields field:field:��һ������ͼ���ڶ����û���ҳչʾͼ����������Ʒ����ͼ  
	*/ 
	private String[] images = new String[7];
	/**  
	* @Fields field:field:��һ�����û���ҳ�������֣���������Ʒ������������
	*/ 
	private String[] description = new String[6];
	private String group;
	private int memory;
	private int pixel;
	private int battery;
	private String processor;
	
	
	public Product(int id,int price,String name,
			String image,String image2,String image3,
			String image4,String image5,String image6,
			String image7,String description1,
			String description2,String description3,
			String description4,String description5,
			String description6,String group,int memory,
			int pixel,int battery,String processor) throws IOException {
		this.id = id;
		this.price = price;
		this.name = name;
		this.images[0] = image;
		this.images[1] = image2;
		this.images[2] = image3;
		this.images[3] = image4;
		this.images[4] = image5;
		this.images[5] = image6;
		this.images[6] = image7;
		this.description[0] = description1;
		this.description[2] = description2;
		this.description[3] = description3;
		this.description[4] = description4;
		this.description[5] = description5;
		this.group = group;
		this.memory = memory;
		this.pixel = pixel;
		this.battery = battery;
		this.processor = processor;
		
		
		// TODO �Զ����ɵĹ��캯�����
	}
	
	/**  
	* ����һ���µ�ʵ�� Product.  
	*    
	*/
	public Product() {
		// TODO �Զ����ɵĹ��캯�����
	}
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price Ҫ���õ� price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return images
	 */
	public String[] getImages() {
		return images;
	}
	/**
	 * @param images Ҫ���õ� images
	 */
	public void setImages(String[] images) {
		this.images = images;
	}
	/**
	 * @return group
	 */
	public String getGroup() {
		return group;
	}
	/**
	 * @param group Ҫ���õ� group
	 */
	public void setGroup(String group) {
		this.group = group;
	}
	/**
	 * @return memory
	 */
	public int getMemory() {
		return memory;
	}
	/**
	 * @param memory Ҫ���õ� memory
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}
	/**
	 * @return pixel
	 */
	public int getPixel() {
		return pixel;
	}
	/**
	 * @param pixel Ҫ���õ� pixel
	 */
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	/**
	 * @return battery
	 */
	public int getBattery() {
		return battery;
	}
	/**
	 * @param battery Ҫ���õ� battery
	 */
	public void setBattery(int battery) {
		this.battery = battery;
	}
	/**
	 * @return processor
	 */
	public String getProcessor() {
		return processor;
	}
	/**
	 * @param processor Ҫ���õ� processor
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	/**
	 * @return description
	 */
	public String[] getDescription() {
		return description;
	}
	/**
	 * @param description Ҫ���õ� description
	 */
	public void setDescription(String[] description) {
		this.description = description;
	}

}
