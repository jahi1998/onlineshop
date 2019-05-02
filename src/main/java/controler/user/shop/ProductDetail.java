/**  
* @Title: ProductDetail.java  
* @Package controler.user.shop  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author SongKaikai  
* @date 2019��3��8��  
* @version V1.0  
*/ 
package controler.user.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Customer;
import entity.Product;

/**
 * @author SongKaikai
 *
 */
public class ProductDetail extends HttpServlet{
	/**  
	* @Fields field:field:{todo}(��һ�仰�������������ʾʲô)  
	*/ 
	private static final long serialVersionUID = 1L;
	Product[] product;

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
		// TODO �Զ����ɵķ������
		Customer customer = (Customer)req.getSession().getAttribute("customer");
		String proId = req.getParameter("proId");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter printWriter = resp.getWriter();
		try {
			if (customer.addProduct2Trolley(Integer.parseInt(proId))) {
				printWriter.print("yes");
			}
			else {
				printWriter.print("yes");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			printWriter.print("no");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			printWriter.print("no");
			e.printStackTrace();
		}
		
		
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
		// TODO �Զ����ɵķ������
		Customer customer = (Customer)req.getSession().getAttribute("customer");
		String proId = req.getParameter("pid");
		System.out.println(proId);
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter printWriter = resp.getWriter();
		try {
			if (customer.addProduct2Trolley(Integer.parseInt(proId))) {
				printWriter.print("yes");
				String[] productsid = {proId};
				req.getSession().setAttribute("trollryvale", productsid);
				req.getRequestDispatcher("/user/shop/payment.jsp").forward(req, resp);
			}
			else {
				printWriter.print("yes");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			printWriter.print("no");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			printWriter.print("no");
			e.printStackTrace();
		}
	}
	

}
