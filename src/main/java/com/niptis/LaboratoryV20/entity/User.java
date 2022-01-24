package com.niptis.LaboratoryV20.entity;

public class User {
    private String login;
    private String email;
    private String password;

    public User(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;

    }

    public String getEmail() {
        return email;
    }
}
