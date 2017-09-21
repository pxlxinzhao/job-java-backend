package com.patrickpu.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.patrickpu.job.model.User;
import com.patrickpu.job.service.UserService;

@RestController
@RequestMapping("/users")
public class UserRestController {
	
	   @Autowired
	   private UserService userService;

	   @RequestMapping(method = RequestMethod.GET, value = "/list")
	   public List<User> listAllUser() {
		   
		  List<User> users = userService.list();

	      return users;
	   }
}
