package com.example.Yagoo.u_reply.service;

import com.example.Yagoo.u_reply.repository.U_ReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class U_ReplyService {
    private final U_ReplyRepository u_replyRepository;

}
