package com.example.Yagoo.user.entity;

import com.example.Yagoo.user.role.Role;
import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.Set;


@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_NO")
    private Integer id;

    private String userID;

    private String password;

    private String email;

    private String nickName;
    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private Set<Role> role;

    private LocalDateTime joinDate;

    private String socail;
}
