package com.patrickpu.job.service;

import java.util.List;

import com.patrickpu.job.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
   User getUserById(Long id);
   User getUserByUsername(String username);
   User getUserByEmail(String email);
   void registerUser(String username, String password, String email, String nickname);
}
