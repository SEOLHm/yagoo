package com.example.Yagoo.community.entity;

import com.example.Yagoo.team.Team;
import com.example.Yagoo.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Team team;
    @Column(nullable = false)
    private User user;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_IMG_ID")
    private C_Img c_img;
    @Column(columnDefinition = " int default 0")
    private Integer viewCount;
    @Column(columnDefinition = " int default 0")
    private Integer like;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime writeDate;

}
