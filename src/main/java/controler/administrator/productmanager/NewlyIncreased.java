/**  
* @Title: NewlyIncreased.java  
* @Package controler.administrator.productmanager  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author SongKaikai  
* @date 2019��3��8��  
* @version V1.0  
*/ 
package controler.administrator.productmanager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

import entity.Product;
import entity.Product_administrator;

/**
 * @author SongKaikai
 *
 */
@MultipartConfig
public class NewlyIncreased extends HttpServlet{

	/**  
	* @Fields field:field:{todo}(��һ�仰�������������ʾʲô)  
	*/ 
	private static final long serialVersionUID = 1L;

	
	
    // �ϴ��ļ��洢Ŀ¼
    private static final String UPLOAD_DIRECTORY = "image";
 
    // �ϴ�����
    private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB
 
	
	
	
	
	
	
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
		//Product_administrator administrator = new Product_administrator((Admin)req.getSession().getAttribute("admin"));
		String cpu =null;
        String des = null;
        String pixelString = null;
        String memString = null;
        String nameString = null;
        String priceString = null;;
        String butteryString = null;
        String serieString = null;
        String dbPath = null;
//        System.out.println(priceString);
		
		
		
		 // ����Ƿ�Ϊ��ý���ϴ�
        if (!ServletFileUpload.isMultipartContent(req)) {
            // ���������ֹͣ
            PrintWriter writer = resp.getWriter();
            writer.println("Error: ��������� enctype=multipart/form-data");
            writer.flush();
            writer.close();
            return;
        }
 
        // �����ϴ�����
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // �����ڴ��ٽ�ֵ - �����󽫲�����ʱ�ļ����洢����ʱĿ¼��
        factory.setSizeThreshold(MEMORY_THRESHOLD);
        // ������ʱ�洢Ŀ¼
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
 
        ServletFileUpload upload = new ServletFileUpload(factory);
         
        // ��������ļ��ϴ�ֵ
        upload.setFileSizeMax(MAX_FILE_SIZE);
         
        // �����������ֵ (�����ļ��ͱ�����)
        upload.setSizeMax(MAX_REQUEST_SIZE);

        // ���Ĵ���
        upload.setHeaderEncoding("UTF-8"); 

        // ������ʱ·�����洢�ϴ����ļ�
        // ���·����Ե�ǰӦ�õ�Ŀ¼
        System.out.println("servletcontent----"+req.getServletContext().getRealPath("./"));
        String uploadPath = req.getServletContext().getRealPath("./") + File.separator + UPLOAD_DIRECTORY;
         
        // ���Ŀ¼�������򴴽�
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
        
        try {
            // ���������������ȡ�ļ�����
            List<FileItem> formItems = upload.parseRequest(new ServletRequestContext(req));
            String fileName=null;
            
            if (formItems != null && formItems.size() > 0) {
                // ����������
            	
                for (FileItem item : formItems) {
                    // �����ڱ��е��ֶ�
                    if (!item.isFormField()) {
                    	
                  
                        fileName = new File(item.getName()).getName();
                     
                        if (!fileName.substring(fileName.length()-3).equals("png")
                        		&&
                        		!fileName.substring(fileName.length()-3).equals("jpg")
                        		&&
                        		!fileName.substring(fileName.length()-3).equals("gif")
                        		) {
                        	req.setAttribute("message",
                                    "���ϴ�һ��ͼƬ!");
                        	req.getServletContext().getRequestDispatcher("/administrator/productmanager/tmp.jsp").forward(
                                    req, resp);
                        	return;
							
						}
                        String filePath = uploadPath + "/" + fileName;
                        File storeFile = new File(filePath);
                        // �ڿ���̨����ļ����ϴ�·��
                        System.out.println(filePath);
                        // �����ļ���Ӳ��
                        item.write(storeFile);
                        req.setAttribute("message",
                            "ͼƬ�ϴ��ɹ�!");
                        dbPath = "image"+ "/" +fileName;
                        
                    }else {
						switch (item.getFieldName()) {
						case "pixel":
							pixelString = item.getString();
							break;
						case "cpu":
							cpu = item.getString();
							break;
						case "mem":
							memString = item.getString();
							break;
						case "buttery":
							butteryString = item.getString();
							break;
						case "price":
							priceString = item.getString();
							break;
						case "name":
							nameString = item.getString();
							break;
						case "des":
							des = item.getString();
							break;
						case "series":
							serieString = item.getString();
							break;

						default:
							break;
						}
					}
                }
                Product product = new Product(Integer.parseInt(priceString),
                		nameString, dbPath, null, null, null, null, null, null, des, null,
                		null, null, null, null, serieString, 
                		Integer.parseInt(memString),
                		Integer.parseInt(pixelString),
                		Integer.parseInt(butteryString), cpu);
                if(new Product_administrator().addProduct(product))
                {
                	req.setAttribute("smessage",
                			"�ɹ�����һ����Ʒ!");
                }
            }
            System.out.println("û��ִ��");
            
        } catch (Exception ex) {
            req.setAttribute("message",
                    "������Ϣ: " + ex.getMessage());
            req.setAttribute("smessage",
                    "����ʧ��");
            System.out.println("û��ִ��----");
            ex.printStackTrace();
        }
        // ��ת�� message.jsp
        req.getServletContext().getRequestDispatcher("/administrator/productmanager/tmp.jsp").forward(
                req, resp);
		
		
		
		
		
	}

}
