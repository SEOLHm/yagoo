package com.example.Yagoo.user.dto;

import com.example.Yagoo.user.role.Role;

import java.time.LocalDateTime;

public class UserDTO {

    private String userID;

    private String password;

    private String email;

    private String nickName;

    private Role role;

    private LocalDateTime joinDate;

    private String socail;
}
