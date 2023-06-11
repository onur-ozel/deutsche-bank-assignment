package com.deutschebank.merchant.tradingprocess;

import algo.Algo;

public abstract class TradingProcess {
  Algo algo;  

  public TradingProcess() {
    this.algo = new Algo();
  }  

  public abstract void apply();  

  public void execute() {
    this.apply();
    algo.doAlgo();
  }
}
