package ManagerSystem.Service;

import ManagerSystem.Domain.User;

/**
 * �û�ҵ��㣬�ṩgetUser��addUser����������֤������û��ķ���������ע��͵�¼ҳ�棨���ܣ�
 * @author Administrator
 *
 */
public interface UserService {

	User getUser(String userName, int userPwd);

	
}
