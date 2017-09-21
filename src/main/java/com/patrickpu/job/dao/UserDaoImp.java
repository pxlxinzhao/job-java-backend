package com.patrickpu.job.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.patrickpu.job.model.User;

/**
 * @author imssbora
 */
@Repository
@SuppressWarnings("unchecked")
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void save(User user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   public List<User> list() {
      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }

	@Override
	public User getUserById(Long id) {
		return sessionFactory.getCurrentSession().get(User.class, id);
	}
	
	@Override
	public User getUserByUsername(String username) {
	      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User where username = :username").setString("username", username);
	      return query.getSingleResult();
	}
	
	@Override
	public User getUserByEmail(String email) {
	      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User where email = :email").setString("email", email);
	      try {
	    	  return query.getSingleResult();
	      }catch(NoResultException ne){
	          return null;
	      }
	}
	
	@Override
	public void registerUser(String username, String password, String email, String nickname) {
		// TODO Auto-generated method stub
		
	}
	   
}
