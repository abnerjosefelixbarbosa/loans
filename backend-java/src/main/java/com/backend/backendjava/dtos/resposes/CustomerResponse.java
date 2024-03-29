package com.backend.backendjava.dtos.resposes;

import com.backend.backendjava.entities.Loan;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private String customer;
    private Collection<LoanResponse> loans;
}
