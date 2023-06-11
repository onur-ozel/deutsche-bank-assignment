package com.deutschebank.merchant.tradingprocess;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TradingProcessFactory {
  static final Logger logger = LoggerFactory.getLogger(TradingProcessFactory.class);

  public static TradingProcess getTradingProcess(Signal signal) {
    switch (signal) {
      case One:
        return new SignalOneProcess();
      case Two:
        return new SignalTwoProcess();
      case Three:
        return new SignalThreeProcess();
      default:
        logger.debug("Default signal type applied");
        return new DefaultProcess();
    }
  }
}
