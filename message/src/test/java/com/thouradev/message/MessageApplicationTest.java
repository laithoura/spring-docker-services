package com.thouradev.message;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
class MessageApplicationTest {

  @BeforeEach
  void setUp() {
    log.info("method=setUp status=started");
  }

  @AfterEach
  void tearDown() {
    log.info("method=tearDown status=started");
  }

  @Test
  public void contextLoads() {

  }

  @Test
  public void sum2Numbers() {
    int number1 = 1;
    int number2 = 2;
    int total = number1 + number2;
    log.info("method=sum2Numbers number1={}, number2={}, total={}", number1, number2, total);
    assertEquals(total, 3);
  }

  @Test
  public void verifyResultIsOddOrEven() {
    assertEquals(oddOrEven(1, 2), "Odd");
    assertEquals(oddOrEven(1, 3), "Even");
    assertEquals(oddOrEven(1, -3), "Even");
  }

  private String oddOrEven(int number1, int number2) {
    int total = number1 + number2;
    log.info("method=oddOrEven number1={}, number2={}, total={}", number1, number2, total);
    if (total % 2 == 0) {
      return "Even";
    }
    return "Odd";
  }
}