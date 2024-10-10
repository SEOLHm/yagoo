package com.example.Yagoo.c_reply.service;

import com.example.Yagoo.c_reply.repository.C_ReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class C_ReplyService {
    private final C_ReplyRepository c_replyRepository;
}
