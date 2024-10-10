package com.example.Yagoo.c_reply.repository;

import com.example.Yagoo.c_reply.entity.C_Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface C_ReplyRepository extends JpaRepository<C_Reply ,Integer> {
}
