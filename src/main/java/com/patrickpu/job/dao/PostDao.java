package com.patrickpu.job.dao;

import java.util.List;

import com.patrickpu.job.model.Post;

public interface PostDao {
	List<Post> list();

	void save(Post post);
}
