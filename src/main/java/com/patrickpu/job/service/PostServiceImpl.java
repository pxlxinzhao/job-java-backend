package com.patrickpu.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patrickpu.job.dao.PostDao;
import com.patrickpu.job.model.Post;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostDao postDao;
	   
	@Override
	@Transactional(readOnly = true)
	public List<Post> list() {
		return postDao.list();
	}

	@Override
	@Transactional
	public void save(Post post) {
		postDao.save(post);		
	}

}
