package com.demo.mythu.controller;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
@GetMapping("/")
public String homepage() {
return "mypage.html"
}
}
