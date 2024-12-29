package com.thinkconstructive.rest_demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.Date;

@Entity
@Table(name = "arif_user_info")
public class ArifUser {

    @Id
    @JsonProperty("userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;


    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public ArifUser(Long userId, String firstName, String lastName, String email) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public ArifUser() {
    }



}
