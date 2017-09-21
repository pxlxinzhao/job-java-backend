package com.patrickpu.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patrickpu.job.dao.UserDao;
import com.patrickpu.job.model.User;

/**
 * @author imssbora
 *
 */
@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   public void save(User user) {
      userDao.save(user);
   }

   @Transactional(readOnly = true)
   public List<User> list() {
      return userDao.list();
   }

	@Override
	@Transactional(readOnly = true)
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}
	
	@Override
	@Transactional(readOnly = true)
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.getUserByUsername(username);
	}
	
	@Override
	@Transactional(readOnly = true)
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userDao.getUserByEmail(email);
	}
	
	@Override
    @Transactional
	public void registerUser(String username, String password, String email, String nickname) {
		// TODO Auto-generated method stub
	}

}
