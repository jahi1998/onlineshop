/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.sql.SQLException;

/**  
* @ClassName: Aftersales_administrator  
* @Description: TODO(������һ�仰��������������)  
* @author WenbinYu  
* @date 2019��3��19��  
*    
*/ 
public class Aftersales_administrator extends Admin{


	
	/**  
	* @Title: verify  
	* @Description: ����ͬ����߾ܾ��ͻ����ۺ�����  ��true��ʾͬ�⣬false��ʾ��ͬ�⣬ͬ�⽫����״̬��Ϊ�ȴ��˻�����ͬ���Ϊ���δͨ��
	* @param @param agrNage
	* @param @param o
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean verify(boolean agrNage,Order o) {
		//TODO
		return true;
	}

	/**
	* <p>Title: searchOrder</p>  
	* <p>Description: </p>  
	* @param state
	* @return  
	 * @throws SQLException 
	* @see entity.Admin#searchOrder(int)  
	* ��������״̬Ϊ�ȴ���˵Ķ���
	*/ 
	@Override
	public Order[] searchOrder(int state) throws SQLException {
		// TODO �Զ����ɵķ������
		return super.searchOrder(state);
	}
	

}
