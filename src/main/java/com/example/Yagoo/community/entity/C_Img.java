package com.example.Yagoo.community.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class C_Img {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String img5;
    private String img6;
    private String img7;
    private String img8;
    private String img9;
    private String img10;
}
