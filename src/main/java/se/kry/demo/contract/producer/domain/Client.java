package se.kry.demo.contract.producer.domain;

import jakarta.validation.constraints.Pattern;

public record Client(@Pattern(regexp = "[0-9]{10}") String id) {
}
