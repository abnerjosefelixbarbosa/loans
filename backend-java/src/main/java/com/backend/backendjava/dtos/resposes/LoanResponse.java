package com.backend.backendjava.dtos.resposes;

import com.backend.backendjava.entities.Loan;
import com.backend.backendjava.entities.Type;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponse {
    private Type type;
    @JsonProperty("interest_rate")
    private Long interestRate;

    public LoanResponse(Loan loan) {
        this.type = loan.getType();
        this.interestRate = loan.getInterestRate();
    }
}
