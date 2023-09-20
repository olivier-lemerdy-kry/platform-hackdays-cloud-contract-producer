package se.kry.demo.contract.producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public abstract class WebBase {

  @BeforeEach
  public void setup(@Autowired MockMvc mockMvc) {
    RestAssuredMockMvc.mockMvc(mockMvc);
  }

}
