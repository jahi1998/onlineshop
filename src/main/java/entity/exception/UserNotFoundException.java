/**  
* @Title: UserNotFoundException.java  
* @Package entity  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author PC  
* @date 2019��4��26��  
* @version V1.0  
*/ 

package entity.exception;


/**  
* @ClassName: UserNotFoundException  
* @Description: TODO(������һ�仰��������������)  
* @author PC  
* @date 2019��4��26��  
*    
*/
public class UserNotFoundException extends Exception{

	/**  
	* @Fields field:field:{todo}(��һ�仰�������������ʾʲô)  
	*/ 
	private static final long serialVersionUID = 1L;

	
	
	
	/**  
	* ����һ���µ�ʵ�� UserNotFoundException.  
	*    
	*/
	public UserNotFoundException(String mas) {
		// TODO Auto-generated constructor stub
		super(mas);
	}
	
	/**
	* <p>Title: getMessage</p>  
	* <p>Description: </p>  
	* @return  
	* @see java.lang.Throwable#getMessage()  
	*/ 
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	/**
	* <p>Title: getCause</p>  
	* <p>Description: </p>  
	* @return  
	* @see java.lang.Throwable#getCause()  
	*/ 
	@Override
	public synchronized Throwable getCause() {
		// TODO Auto-generated method stub
		return super.getCause();
	}

	/**
	* <p>Title: toString</p>  
	* <p>Description: </p>  
	* @return  
	* @see java.lang.Throwable#toString()  
	*/ 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	/**
	* <p>Title: printStackTrace</p>  
	* <p>Description: </p>    
	* @see java.lang.Throwable#printStackTrace()  
	*/ 
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}

}
