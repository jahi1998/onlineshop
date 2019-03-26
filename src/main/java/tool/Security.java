/**  
* @Title: Security.java  
* @Package tool  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author WenbinYu  
* @date 2019��3��22��  
* @version V1.0  
*/ 

package tool;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**  
* @ClassName: Security  
* @Description: TODO(������һ�仰��������������)  
* @author WenbinYu  
* @date 2019��3��22��  
*    
*/
public class Security {
	
	
	
	/**  
	* @Title: byte2Hex  
	* @Description: ������ת16���� 
	* @param @param bytes
	* @param @return    ����  
	* @return String    ��������  
	* @throws  
	*/  
	private static String byte2Hex(byte[] bytes){
		 StringBuffer stringBuffer = new StringBuffer();
		 String temp = null;
		 for (int i=0;i<bytes.length;i++){
		  temp = Integer.toHexString(bytes[i] & 0xFF);
		  if (temp.length()==1){
		  //1�õ�һλ�Ľ��в�0����
		  stringBuffer.append("0");
		  }
		  stringBuffer.append(temp);
		 }
		 return stringBuffer.toString();
		}
	
	 /**  
	* @Title: getSHA256StrJava  
	* @Description: �Դ�����ַ�������sha256���㣬���ض�Ӧ�Ĺ�ϣ�� 
	* @param @param str
	* @param @return    ����  
	* @return String    ��������  
	* @throws  
	*/  
	public static String getSHA256StrJava(String str){
		 MessageDigest messageDigest;
		 String encodeStr = "";
		 try {
		  messageDigest = MessageDigest.getInstance("SHA-256");
		  messageDigest.update(str.getBytes("UTF-8"));
		  encodeStr = byte2Hex(messageDigest.digest());
		 } catch (NoSuchAlgorithmException e) {
		  e.printStackTrace();
		 } catch (UnsupportedEncodingException e) {
		  e.printStackTrace();
		 }
		 return encodeStr;
		}

}
