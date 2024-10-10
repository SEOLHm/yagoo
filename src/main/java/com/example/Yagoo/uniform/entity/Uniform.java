package com.example.Yagoo.uniform.entity;

import com.example.Yagoo.community.entity.C_Img;
import com.example.Yagoo.team.Team;
import com.example.Yagoo.user.entity.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Uniform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    private Team team;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
    private U_Img u_img;
    @Column(columnDefinition = " int default 0")
    private Integer viewCount;
    @Column(columnDefinition = " int default 0")
    private Integer like;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime writeDate;

}
