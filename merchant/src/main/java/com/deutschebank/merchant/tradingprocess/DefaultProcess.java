package com.deutschebank.merchant.tradingprocess;

public class DefaultTradingProcess extends TradingProcess {
  @Override
  public void apply() {
    algo.cancelTrades();
  }
}