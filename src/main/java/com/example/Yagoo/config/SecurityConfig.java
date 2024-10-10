package com.example.Yagoo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {

    //Bcript 암호와 메서드
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){

        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        //인가작업 진행
        http
                .authorizeHttpRequests((auth)->auth
                        //모두접근가능
                        .requestMatchers("").permitAll()
                        //ADMIN만 접근가능
                        .requestMatchers("/admin").hasRole("ADMIN")

                        .anyRequest().authenticated() // 그 외 모든 요청은 인증된 사용자만 접근 가능

                );
        //커스텀 로그인 설정
        http
                .formLogin((auth) ->
                        auth.loginPage("/loginForm")              // 1. 사용자 정의 로그인 페이지를 "/loginForm" 경로로 설정
                                .loginProcessingUrl("/login")  // 2. 로그인 요청을 처리할 URL을 "/login"로 설정
                                .permitAll()                       // 3. 로그인 페이지와 로그인 처리 URL에 모든 사용자가 접근할 수 있도록 허용
                );
        //cslf 사이트 위변조 방지설정
        http
                .csrf((auth)->auth.disable());

        return http.build();

    }


}
