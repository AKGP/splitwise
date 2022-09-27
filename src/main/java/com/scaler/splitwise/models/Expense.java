package com.scaler.splitwise.models;

import lombok.Data;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.HashMap;
import java.util.Map;

@Data
@Entity
@Table(name="EXPENSES")
public class Expense extends BaseModel{
    private String description;
    private double totalAmount;
    private Long amount; // in paise so that we won't run into precision issue

    @ManyToOne
    private User createdBy;

    @ElementCollection
    private Map<User, Long> paidBy = new HashMap<>();

    @ElementCollection
    private Map<User, Long> owedBy = new HashMap<>();

}
