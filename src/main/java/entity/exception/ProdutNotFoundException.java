/**  
* @Title: ProdutNotFoundException.java  
* @Package entity.exception  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author PC  
* @date 2019��4��26��  
* @version V1.0  
*/ 

package entity.exception;


/**  
* @ClassName: ProdutNotFoundException  
* @Description: TODO(������һ�仰��������������)  
* @author PC  
* @date 2019��4��26��  
*    
*/
public class ProdutNotFoundException extends Exception {

	/**  
	* @Fields field:field:{todo}(��һ�仰�������������ʾʲô)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	public ProdutNotFoundException(String mas)
	{
		super(mas);
	}

}
