package com.patrickpu.job.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.patrickpu.job.model.Post;

@SuppressWarnings("unchecked")
@Repository
public class PostDaoImpl implements PostDao{

    @Autowired
    private SessionFactory sessionFactory;
	   
	@Override
	public List<Post> list() {
		TypedQuery<Post> query = sessionFactory.getCurrentSession().createQuery("from Post");
	      return query.getResultList();
	}

}
