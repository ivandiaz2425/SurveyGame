package com.i034114.surveygame.Models;

/**
 * Created by IVANCHO on 15/11/2017.
 */

public class Users {
    private Integer id;
    private String name;
    private String identification_card;
    private String phone;
    private String email;
    private String password;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification_card() {
        return identification_card;
    }

    public void setIdentification_card(String identification_card) {
        this.identification_card = identification_card;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
