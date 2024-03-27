package com.backend.java.backendjava.controllers;

import com.backend.java.backendjava.dtos.requests.LoanRequest;
import com.backend.java.backendjava.dtos.responses.LoanResponse;
import com.backend.java.backendjava.services.LoanService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @PostMapping("/customer-loans")
    public ResponseEntity<LoanResponse> grantLoan(@RequestBody @Valid LoanRequest request) {
        var response = loanService.grantLoan(request);
        return ResponseEntity.status(200).body(response);
    }
}
