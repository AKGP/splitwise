package com.scaler.splitwise.models;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
@Data
@MappedSuperclass // id we want to make a super class
@EntityListeners(AuditingEntityListener.class)
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;


    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}
