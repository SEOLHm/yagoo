package com.example.Yagoo.u_reply.entity;

import com.example.Yagoo.uniform.entity.Uniform;
import com.example.Yagoo.user.entity.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class U_Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UNIFORM_ID")
    private Uniform uniform;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
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
