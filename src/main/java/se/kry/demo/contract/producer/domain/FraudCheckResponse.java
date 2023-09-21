package se.kry.demo.contract.producer.domain;

public record FraudCheckResponse(FraudCheckStatus fraudCheckStatus, String rejection) {
}
