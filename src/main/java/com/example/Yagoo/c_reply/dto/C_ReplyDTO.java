package com.example.Yagoo.c_reply.dto;

import com.example.Yagoo.community.dto.CommunityDTO;
import com.example.Yagoo.user.dto.UserDTO;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class C_ReplyDTO {

    private CommunityDTO community;
    private UserDTO user;
    private String content;
    private LocalDateTime writeDate;
    private Integer like;
    private Integer hate;
}
