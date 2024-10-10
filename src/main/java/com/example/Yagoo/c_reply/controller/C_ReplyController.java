package com.example.Yagoo.c_reply.controller;

import com.example.Yagoo.c_reply.service.C_ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class C_ReplyController {

    private final C_ReplyService c_replyService;
}
