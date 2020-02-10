package com.example.demo.controller;

import com.example.demo.auth.SimpleLoginUser;
import com.example.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping(value = "members")
@Slf4j
public class ContentsController {

  @GetMapping(value = "/")
  public String any(@AuthenticationPrincipal Principal principal) {
    UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken)principal;
    log.info("name:{}, authorities:{}", token.getName(), token.getAuthorities());
    SimpleLoginUser loginUser = (SimpleLoginUser)token.getPrincipal();
    log.info("id:{}, name:{}", loginUser.getUser().getId(), loginUser.getUser().getName());
    return "members/index";
  }

  @GetMapping(value = "user")
  public String user(@AuthenticationPrincipal SimpleLoginUser loginUser) {
    log.info("id:{}, name:{}", loginUser.getUser().getId(), loginUser.getUser().getName());
    return "members/user/index";
  }

  @GetMapping(value = "admin")
  public String admin(@AuthenticationPrincipal(expression = "user") User user) {
    log.info("id:{}, name:{}", user.getId(), user.getName());
    return "members/admin/index";
  }

}
