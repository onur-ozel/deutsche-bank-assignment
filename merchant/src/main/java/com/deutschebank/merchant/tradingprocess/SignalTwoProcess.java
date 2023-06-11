package com.deutschebank.merchant.tradingprocess;

public class SignalTwoProcess extends TradingProcess {
  final TradingParam param = new TradingParam(1, 80);

  @Override
  public void apply() {
    algo.reverse();
    algo.setAlgoParam(param.getParam(), param.getValue());
    algo.submitToMarket();    
  }
}
