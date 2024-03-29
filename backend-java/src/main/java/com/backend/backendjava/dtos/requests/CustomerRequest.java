package com.backend.backendjava.dtos.requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
    @NotNull
    Long age;
    @CPF
    @NotEmpty
    @NotNull
    String cpf;
    @NotNull
    @NotEmpty
    @Length(max = 50)
    String name;
    @NotNull
    Double income;
    @NotEmpty
    @NotNull
    @Length(max = 2)
    String location;
}
