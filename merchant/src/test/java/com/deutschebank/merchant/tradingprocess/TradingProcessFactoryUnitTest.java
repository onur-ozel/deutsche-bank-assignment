package com.deutschebank.merchant.tradingprocess;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TradingProcessFactoryUnitTest {
  @Test
  void signalOneShouldCreateSignalOneProcess() {
    assertTrue(TradingProcessFactory.getTradingProcess(Signal.One) instanceof SignalOneProcess);
  }

  @Test
  void signalTwoShouldCreateSignalTwoProcess() {
    assertTrue(TradingProcessFactory.getTradingProcess(Signal.Two) instanceof SignalTwoProcess);
  }

  @Test
  void signalThreeShouldCreateSignalThreeProcess() {
    assertTrue(TradingProcessFactory.getTradingProcess(Signal.Three) instanceof SignalThreeProcess);
  }

  @Test
  void undefinedSignalShouldCreateDefaultProcess() {
    assertTrue(TradingProcessFactory.getTradingProcess(Signal.Undefined) instanceof DefaultProcess);
  }
}