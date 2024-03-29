package com.backend.backendjava.controllers;

import com.backend.backendjava.dtos.requests.CustomerRequest;
import com.backend.backendjava.dtos.resposes.CustomerResponse;
import com.backend.backendjava.services.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/loans")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/customer-loans")
    public ResponseEntity<CustomerResponse> grantLoan(@RequestBody @Valid CustomerRequest request) {
        CustomerResponse response = service.grantLoan(request);
        return ResponseEntity.status(200).body(response);
    }
}
