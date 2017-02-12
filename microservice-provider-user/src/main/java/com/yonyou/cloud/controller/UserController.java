package com.yonyou.cloud.controller;

import com.yonyou.cloud.entity.User;
import com.yonyou.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuxin on 2017/2/10.
 */
@RestController
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/simple/{id}")
  public User userInfo(@PathVariable Long id){
    return userRepository.findOne(id);
  }
}
