package com.backend.java.backendjava.services;

import com.backend.java.backendjava.dtos.requests.LoanRequest;
import com.backend.java.backendjava.dtos.responses.LoanResponse;
import com.backend.java.backendjava.entities.Loan;
import com.backend.java.backendjava.entities.Type;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LoanService {
    public LoanResponse grantLoan(LoanRequest request) {
        Collection<Loan> loans = new ArrayList<>();

        if (request.income() <= 3000) {
            loans.add(new Loan(Type.PERSONAL, 4L));
        }
        if (request.income() > 3000 && request.income() < 5000 ||
                request.age() < 30 && request.location().equals("SP")) {
            loans.add(new Loan(Type.PERSONAL, 4L));
        }
        if (request.income() >= 5000) {
            loans.add(new Loan(Type.CONSIGNMENT, 2L));
        }
        if (request.income() <= 3000) {
            loans.add(new Loan(Type.GUARANTEED, 3L));
        }
        if (request.income() > 3000 && request.income() < 5000 ||
                request.age() < 30 && request.location().equals("SP")) {
            loans.add(new Loan(Type.GUARANTEED, 3L));
        }

        return new LoanResponse(request.name(), loans);
    }
}
