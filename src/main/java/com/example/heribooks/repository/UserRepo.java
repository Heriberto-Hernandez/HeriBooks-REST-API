package com.example.heribooks.repository;

import com.example.heribooks.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserInfo, Integer> {

    UserInfo findByUsername(String username);
}
