package com.blazingsales.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.UUID;


@Entity
@Data
public class PurchaseFeedback {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(updatable = false, nullable = false)
    @Type(type = "org.hibernate.type.UUIDCharType")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String purchase;
    private String sellersRating;
    private String sellersComment;
    private String buyersRating;
    private String buyersComment;
    private boolean isActive;

}
