package com.example.Yagoo.team;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(nullable = false)
    private String teamName;
    @Column(nullable = false)
    private String logo;
}
