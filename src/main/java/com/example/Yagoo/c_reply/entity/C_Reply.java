package com.example.Yagoo.c_reply.entity;

import com.example.Yagoo.community.entity.Community;
import com.example.Yagoo.user.entity.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class C_Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Community community;
    @Column(nullable = false)
    private User user;
    @Column(nullable = false)
    private String content;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime writeDate;
    @Column(columnDefinition = " int default 0")
    private Integer like;
    @Column(columnDefinition = " int default 0")
    private Integer hate;
}
