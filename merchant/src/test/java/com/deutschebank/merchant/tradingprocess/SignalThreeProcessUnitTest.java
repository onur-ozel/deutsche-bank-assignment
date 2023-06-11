package com.deutschebank.merchant.tradingprocess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SignalThreeProcessUnitTest {
  @Test
  void hasValidParameter1() {
    SignalThreeProcess process = new SignalThreeProcess();
    assertEquals(process.param1.getParam(), 1);
    assertEquals(process.param1.getValue(), 90);
  }

  @Test
  void hasValidParameter2() {
    SignalThreeProcess process = new SignalThreeProcess();
    assertEquals(process.param2.getParam(), 2);
    assertEquals(process.param2.getValue(), 15);
  }
}
