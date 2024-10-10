package com.example.Yagoo.uniform.repository;

import com.example.Yagoo.uniform.entity.Uniform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniformRepository extends JpaRepository<Uniform,Integer> {
}
