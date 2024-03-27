package com.backend.java.backendjava.dtos.requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

public record LoanRequest(
     @NotNull
     Long age,
     @CPF
     @NotEmpty
     @NotNull
     String cpf,
     @NotNull
     @NotEmpty
     @Length(max = 50)
     String name,
     @NotNull
     Double income,
     @NotEmpty
     @NotNull
     @Length(max = 2)
     String location
) { }