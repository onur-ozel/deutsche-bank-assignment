package com.deutschebank.merchant.tradingprocess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SignalOneProcessUnitTest {
  @Test
  void hasValidParameter() {
    SignalOneProcess process = new SignalOneProcess();
    assertEquals(process.param.getParam(), 1);
    assertEquals(process.param.getValue(), 60);
  }
}
