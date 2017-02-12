package com.yonyou.cloud.controller;

import com.yonyou.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liuxin on 2017/2/10.
 */
@RestController
public class UserController {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/{id}")
  public User userInfo(@PathVariable Long id){
    return restTemplate.getForObject("http://localhost:7900/simple/" + id, User.class);
  }
}
