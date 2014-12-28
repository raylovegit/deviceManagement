package stu.login;

import java.util.Map;

import stu.user.User;
import stu.user.UserDao;

import common.util.PageAction;


public class LoginAction extends PageAction{
	
	private User user=new User();
	private UserDao userDao;
    protected Map<String,Object> session;
    private String rand1=null;
	
    public String preLogin(){
    		return "login";	
    }
    
	public String loginValidate(){
		if(session.get("rand").equals(rand1)){
			user=userDao.login(user);
			if(user!=null){
				session.put("userLogin", user);
				//如果用户类型是管理员，则跳到admin_index,否则就跳到user_index.jsp
				if("0".equals(user.getUserType()))
					return "admin_login";
				else 
					return "user_login";
			}else{
				return "login_fail";
			}
		}else{
			return "login_fail";
		}	
	}
	
	// �˳�
	public String logout() {
		session.clear();
		return "login_fail";
	}
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getRand1() {
		return rand1;
	}

	public void setRand1(String rand1) {
		this.rand1 = rand1;
	}
	

}
