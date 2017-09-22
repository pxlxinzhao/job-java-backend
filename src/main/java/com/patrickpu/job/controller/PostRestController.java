package com.patrickpu.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.patrickpu.job.model.Post;
import com.patrickpu.job.service.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostRestController {
	   @Autowired
	   private PostService postService;

	   @RequestMapping(method = RequestMethod.GET, value = "/list")
	   public List<Post> listAllPost() {
		  List<Post> posts = postService.list();
	      return posts;
	   }
}	
