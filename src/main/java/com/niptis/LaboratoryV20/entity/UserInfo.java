package com.niptis.LaboratoryV20.entity;

public class UserInfo {
    private String email;
    private String login;
    private String password;

    public UserInfo(String email, String login, String password) {
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
