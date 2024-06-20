package com.mynt.mynt.service;

import com.mynt.mynt.dto.LoginDTO;
import com.mynt.mynt.util.jwt.JWT;

// 1. recive username && password
// 2. check DB for if user exits
// 3. check for correct password
// 4. if correct password && username return JWT to the user

public class LoginService {

    private LoginDTO loginDTO;
    private String jwt;

    public LoginService(){}

    public LoginService(LoginDTO loginDTO){

        // TODO: 1. recive username && password
        this.loginDTO = loginDTO;

        // TODO: Alex F Task - 2. check DB for if user exits

        // TODO: Alex F Task - 3. check for correct password

        // TODO: James Love Task - 4. if correct password && username return JWT to the user
        this.jwt = generateJwt(loginDTO.getUsername());

    }

    public LoginDTO getLoginDTO() {
        return loginDTO;
    }

    public void setLoginDTO(LoginDTO loginDTO) {
        this.loginDTO = loginDTO;
    }

    public String getJwt() {
        return this.jwt;
    }

    public String generateJwt(String clientName) {
        JWT newToken = new JWT();
        return newToken.createJWT(clientName);
    }



}