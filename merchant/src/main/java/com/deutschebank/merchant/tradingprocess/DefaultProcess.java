package com.deutschebank.merchant.tradingprocess;

public class DefaultProcess extends TradingProcess {
  @Override
  public void apply() {
    algo.cancelTrades();
  }
}
