package com.example.Yagoo.uniform.dto;

import com.example.Yagoo.team.TeamDTO;
import com.example.Yagoo.user.dto.UserDTO;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UniformDTO {

    private TeamDTO team;
    private UserDTO user;
    private String title;
    private String content;
    private U_ImgDTO u_img;
    private Integer viewCount;
    private Integer like;
    private LocalDateTime writeDate;
}
