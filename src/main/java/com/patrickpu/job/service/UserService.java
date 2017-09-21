package com.patrickpu.job.service;

import java.util.List;

import com.patrickpu.job.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}
