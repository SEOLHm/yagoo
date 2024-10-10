package com.example.Yagoo.community.dto;

import com.example.Yagoo.team.TeamDTO;
import com.example.Yagoo.user.dto.UserDTO;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class CommunityDTO {

    private TeamDTO team;
    private UserDTO user;
    private String title;
    private String content;
    private C_ImgDTO c_Img;
    private int viewCount;
    private int like;
    private LocalDateTime writeDate;


}
