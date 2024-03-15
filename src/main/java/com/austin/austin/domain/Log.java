package com.austin.austin.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class Log {

    @Id
    private String username;
    private String password;
    public Log(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Log() {
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    
}
