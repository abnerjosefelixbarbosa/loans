package com.backend.backendjava.services;

import com.backend.backendjava.dtos.requests.CustomerRequest;
import com.backend.backendjava.dtos.resposes.CustomerResponse;
import com.backend.backendjava.dtos.resposes.LoanResponse;
import com.backend.backendjava.entities.Loan;
import com.backend.backendjava.entities.Type;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class CustomerService {
    public CustomerResponse grantLoan(CustomerRequest request) {
        Collection<Loan> loans = new ArrayList<>();

        if (request.getIncome() <= 3000) {
            loans.add(new Loan(Type.PERSONAL, 4L));
        }
        if (request.getIncome() > 3000 && request.getIncome() < 5000 ||
                request.getAge() < 30 && request.getLocation().equals("SP")) {
            loans.add(new Loan(Type.PERSONAL, 4L));
        }
        if (request.getIncome() >= 5000) {
            loans.add(new Loan(Type.CONSIGNMENT, 2L));
        }
        if (request.getIncome() <= 3000) {
            loans.add(new Loan(Type.GUARANTEED, 3L));
        }
        if (request.getIncome() > 3000 && request.getIncome() < 5000 ||
                request.getAge() < 30 && request.getLocation().equals("SP")) {
            loans.add(new Loan(Type.GUARANTEED, 3L));
        }

        return new CustomerResponse(request.getName(), loans.stream().map(LoanResponse::new).toList());
    }
}
