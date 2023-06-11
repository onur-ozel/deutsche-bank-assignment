package com.deutschebank.merchant.service;

import com.deutschebank.merchant.tradingprocess.Signal;
import com.deutschebank.merchant.tradingprocess.TradingProcess;
import com.deutschebank.merchant.tradingprocess.TradingProcessFactory;
import org.springframework.stereotype.Service;

@Service
public class SignalService implements SignalHandler {
  @Override
  public void handleSignal(int signal) {
    TradingProcess process = TradingProcessFactory.getTradingProcess(Signal.fromInt(signal));
    process.execute();
  }
}
