package com.mynt.banking.auth;

public class JwtDto {
    private String jwt;

    public JwtDto(){}

    public JwtDto(String jwt) {
        this.jwt = jwt;
    }
    public String getJWT() {
        return jwt;
    }
    public void setJWT(String jwt) {
        this.jwt = jwt;
    }

}