package ManagerSystem.Service;

import java.sql.SQLException;

import ManagerSystem.Domain.User;

/**
 * �û�ҵ��㣬�ṩgetUser��addUser����������֤������û��ķ���������ע��͵�¼ҳ�棨���ܣ�
 * @author Administrator
 *
 */
public interface UserService {

	User loginUser(String userName, String userPwd) throws SQLException;

	
}
