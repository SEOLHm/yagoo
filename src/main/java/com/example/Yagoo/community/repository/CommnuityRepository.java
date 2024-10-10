package com.example.Yagoo.community.repository;

import com.example.Yagoo.community.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommnuityRepository extends JpaRepository<Community,Integer> {

}
