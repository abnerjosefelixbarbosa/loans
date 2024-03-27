package com.backend.java.backendjava.entities;

import com.backend.java.backendjava.dtos.requests.LoanRequest;
import jakarta.persistence.*;

import java.io.Serializable;

public class Customer implements Serializable {
    private Long id;
    private Long age;
    private String cpf;
    private String name;
    private Double income;
    private String location;

    public Customer() {}

    public Customer(Long id, Long age, String cpf, String name, Double income, String location) {
        this.id = id;
        this.age = age;
        this.cpf = cpf;
        this.name = name;
        this.income = income;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
