package se.kry.demo.contract.producer.web;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fraudcheck")
public class FraudCheckController {

  @PutMapping
  public FraudCheckResponse fraudCheck(@RequestBody @Valid FraudCheckRequest request) {
    if (request.loanAmount() > 10000) {
      return new FraudCheckResponse(FraudCheckStatus.FRAUD, "Amount too high");
    }
    return new FraudCheckResponse(FraudCheckStatus.OK, null);
  }
}
