package com.austin.austin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.austin.austin.domain.Log; 

@Repository
public interface LogRepo extends JpaRepository<Log, String> {
    Log findByUsernameAndPassword(String username, String password); }
