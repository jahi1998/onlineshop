/**  
* @Title: ProductManager.java  
* @Package controler.administrator.productmanager  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author SongKaikai  
* @date 2019��3��8��  
* @version V1.0  
*/ 
package controler.administrator.productmanager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Admin;
import entity.Product;
import entity.Product_administrator;

/**
 * @author SongKaikai
 *
 */
public class ProductManager extends HttpServlet{

	/**  
	* @Fields field:field:{todo}(��һ�仰�������������ʾʲô)  
	*/ 
	private static final long serialVersionUID = 1L;

	/**
	* <p>Title: doGet</p>  
	* <p>Description: </p>  
	* @param req
	* @param resp
	* @throws ServletException
	* @throws IOException  
	* @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)  
	*/ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	/**
	* <p>Title: doPost</p>  
	* <p>Description: </p>  
	* @param req
	* @param resp
	* @throws ServletException
	* @throws IOException  
	* @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)  
	*/ 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String proId = req.getParameter("pid");
		
		Product_administrator product_administrator = new Product_administrator((Admin)req.getSession().getAttribute("admin"));
		try {
			product_administrator.rmProduct(new Product(Integer.parseInt(proId)));
			resp.sendRedirect(req.getContextPath()+"/administrator/productmanager/productmanager.jsp");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
	

}
