package com.backend.java.backendjava.dtos.responses;

import com.backend.java.backendjava.entities.Customer;
import com.backend.java.backendjava.entities.Loan;

import java.util.Collection;
import java.util.List;

public record LoanResponse(
        String customer,
        Collection<Loan> loans
) { }
