package com.example.Yagoo.user.controller;

import com.example.Yagoo.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserController {

    private UserService userService;



}
