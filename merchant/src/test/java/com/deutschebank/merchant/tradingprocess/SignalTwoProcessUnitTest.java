package com.deutschebank.merchant.tradingprocess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SignalTwoProcessUnitTest {
  @Test
  void hasValidParameter() {
    SignalTwoProcess process = new SignalTwoProcess();
    assertEquals(process.param.getParam(), 1);
    assertEquals(process.param.getValue(), 80);
  }
}
