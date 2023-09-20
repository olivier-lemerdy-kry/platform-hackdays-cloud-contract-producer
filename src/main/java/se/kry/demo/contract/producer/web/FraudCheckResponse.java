package se.kry.demo.contract.producer.web;

public record FraudCheckResponse(FraudCheckStatus fraudCheckStatus, Rejection rejection) {
}
