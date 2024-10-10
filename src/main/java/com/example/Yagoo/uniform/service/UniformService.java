package com.example.Yagoo.uniform.service;

import com.example.Yagoo.uniform.repository.UniformRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UniformService {
    private final UniformRepository uniformRepository;
}
