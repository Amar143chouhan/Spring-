package springMvc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMvc.Dao.UserDao;
import springMvc.Model.User;

@Service
public class UserService {
	
	
	private UserDao userdao;
	
	public int createUser(User user) {
	
			return this.userdao.saveuser(user);
	
	}
	

}
