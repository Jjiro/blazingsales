package com.blazingsales.BlazingSales.entity;


import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String password;
    private String accountName;
    private String province;
    private String city;
    private String accountCreationDate;
    private String accountStatus;
    private String logoType;
    private String accountType;
    private boolean isActive;
}
