package se.kry.demo.contract.producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import se.kry.demo.contract.producer.web.FraudCheckController;

public abstract class BaseContractTest {

  public BaseContractTest() {
    RestAssuredMockMvc.standaloneSetup(new FraudCheckController());
  }

}
