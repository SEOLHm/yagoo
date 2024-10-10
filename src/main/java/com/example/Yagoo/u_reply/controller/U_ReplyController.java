package com.example.Yagoo.u_reply.controller;

import com.example.Yagoo.u_reply.service.U_ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class U_ReplyController {

    private final U_ReplyService u_replyService;
}
