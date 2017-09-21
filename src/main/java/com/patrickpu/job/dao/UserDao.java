package com.patrickpu.job.dao;

import java.util.List;

import com.patrickpu.job.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}
