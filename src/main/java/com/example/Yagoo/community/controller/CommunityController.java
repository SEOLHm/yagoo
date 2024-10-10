package com.example.Yagoo.community.controller;

import com.example.Yagoo.community.service.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CommunityController {

    private final CommunityService communityService;
}
