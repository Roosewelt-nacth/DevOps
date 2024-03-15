package com.austin.austin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.austin.austin.domain.Log;
import com.austin.austin.repository.LogRepo;

@Service
public class LogService {
    @Autowired
    private LogRepo rep;
    public Log log(String Username, String Password){
        Log user=rep.findByUsernameAndPassword(Username, Password);
        return user;
    }
}
