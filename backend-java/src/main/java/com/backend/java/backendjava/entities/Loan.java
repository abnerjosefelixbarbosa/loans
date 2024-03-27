package com.backend.java.backendjava.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

public class Loan implements Serializable {
    private Type type;
    @JsonProperty("interest_rate")
    private Long interestRate;

    public Loan() {}

    public Loan(Type type, Long interestRate) {
        this.type = type;
        this.interestRate = interestRate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Long getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Long interestRate) {
        this.interestRate = interestRate;
    }
}
