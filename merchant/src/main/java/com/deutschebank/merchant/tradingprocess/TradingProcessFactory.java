package com.deutschebank.merchant.tradingprocess;

public class TradingProcessFactory {
  public static TradingProcess getTradingProcess(Signal signal) {
    switch (signal) {
      case One:
        return new SignalOneProcess();
      case Two:
        return new SignalTwoProcess();
      case Three:
        return new SignalThreeProcess();
      default:
        return new DefaultTradingProcess();
    }
  }
}
