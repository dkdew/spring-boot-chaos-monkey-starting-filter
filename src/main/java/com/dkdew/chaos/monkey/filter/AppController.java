package com.dkdew.chaos.monkey.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @GetMapping("/greet")
  public String findById() {
    return "How are you?";
  }

}
