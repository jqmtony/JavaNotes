package carClient.Service;

import java.sql.SQLException;

import carClient.Entity.User;


/**
 * �û�ҵ��㣬�ṩgetUser��addUser����������֤������û��ķ���������ע��͵�¼ҳ�棨���ܣ�
 * @author Administrator
 *
 */
public interface UserService {
	// TODO getResposne
	User loginUser(String userName, String userPwd) throws SQLException;

	
}
