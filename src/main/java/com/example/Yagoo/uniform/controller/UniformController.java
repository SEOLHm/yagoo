package com.example.Yagoo.uniform.controller;

import com.example.Yagoo.uniform.service.UniformService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UniformController {
    private final UniformService uniformService;
}
