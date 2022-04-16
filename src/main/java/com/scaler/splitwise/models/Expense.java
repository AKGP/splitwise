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
    private int amount; // in paise

    @ManyToOne
    private User createdBy;

    @ElementCollection
    private Map<User, Integer> paidBy = new HashMap<User, Integer>();

    @ElementCollection
    private Map<User, Integer> owedBy = new HashMap<User, Integer>();

}
