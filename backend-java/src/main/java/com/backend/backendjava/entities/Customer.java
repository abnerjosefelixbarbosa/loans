package com.backend.backendjava.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer implements Serializable {
    private Long age;
    private String cpf;
    private String name;
    private Double income;
    private String location;
}
