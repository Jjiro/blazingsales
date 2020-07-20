package com.blazingsales.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.UUID;


@Entity
@Data
public class UserAccount {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(updatable = false, nullable = false)
    @Type(type = "org.hibernate.type.UUIDCharType")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String login;
    private String password;
    private String accountName;
    private String province;
    private String city;
    private String accountCreationDate;
    @Enumerated(value = EnumType.STRING)
    private Enum accountStatus;
    private String logoType;
    @Enumerated(value = EnumType.STRING)
    private Enum accountType;
    private boolean isActive;

}
