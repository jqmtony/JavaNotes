package carServer.Service;

import java.sql.SQLException;
import java.util.List;

import carServer.Entity.User;


/**
 * �û�ҵ��㣬�ṩgetUser��addUser����������֤������û��ķ���������ע��͵�¼ҳ�棨���ܣ�
 * @author Administrator
 *
 */
public interface UserService {

	User loginUser(String userName, String userPwd) throws SQLException;

	Boolean registerUser(User user) throws SQLException;

	
}
