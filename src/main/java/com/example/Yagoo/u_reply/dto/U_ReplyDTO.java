package com.example.Yagoo.u_reply.dto;

import com.example.Yagoo.uniform.dto.UniformDTO;
import com.example.Yagoo.user.dto.UserDTO;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class U_ReplyDTO {

    private UniformDTO uniform;
    private UserDTO user;
    private String content;
    private LocalDateTime writeDate;
    private Integer like;
    private Integer hate;
}
