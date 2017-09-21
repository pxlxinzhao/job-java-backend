package com.patrickpu.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.patrickpu.job.model.User;
import com.patrickpu.job.service.UserService;

@RestController
@RequestMapping(value = "/users", headers="Accept=*/*",  produces="application/json")
public class UserRestController {
	
	   @Autowired
	   private UserService userService;

	   @RequestMapping(method = RequestMethod.GET, value = "/list")
	   public List<User> listAllUser() {
		  List<User> users = userService.list();
	      return users;
	   }
	   
	   @RequestMapping(method = RequestMethod.GET, value = "/id/{id}")
	   public User getById(@PathVariable Long id) {
		  User user = userService.getUserById(id);
	      return user;
	   }
	   
	   @RequestMapping(method = RequestMethod.GET, value = "/email")
	   public User getByEmail(@RequestParam(value="email", required=true) String email) {
		  User user = userService.getUserByEmail(email);
	      return user;
	   }
	   
	   @RequestMapping(method = RequestMethod.POST, value = "/register")
	   public @ResponseBody User getByEmail( @RequestBody User user) {
		  userService.save(user);
	      return user;
	   }
}
