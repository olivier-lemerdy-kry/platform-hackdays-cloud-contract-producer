package se.kry.demo.contract.producer.web;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;

public record FraudCheckRequest(@Valid Client client, @Positive int loanAmount) {
}
