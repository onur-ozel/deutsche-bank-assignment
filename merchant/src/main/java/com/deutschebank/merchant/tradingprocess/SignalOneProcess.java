package com.deutschebank.merchant.tradingprocess;

public class SignalOneProcess extends TradingProcess {
  final TradingParam param = new TradingParam(1, 60);

  @Override
  public void apply() {
    algo.setUp();
    algo.setAlgoParam(param.getParam(), param.getValue());
    algo.performCalc();
    algo.submitToMarket();
  }
}

