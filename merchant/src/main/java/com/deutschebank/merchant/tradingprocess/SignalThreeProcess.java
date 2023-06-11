package com.deutschebank.merchant.tradingprocess;

public class SignalThreeProcess extends TradingProcess {
  final TradingParam param1 = new TradingParam(1, 90);
  final TradingParam param2 = new TradingParam(2, 15);

  @Override
  public void apply() {
    algo.setAlgoParam(param1.getParam(), param1.getValue());
    algo.setAlgoParam(param2.getParam(), param2.getValue());
    algo.performCalc();
    algo.submitToMarket();
  }
}
