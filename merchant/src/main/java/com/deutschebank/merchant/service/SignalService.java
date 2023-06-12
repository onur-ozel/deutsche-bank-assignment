package com.deutschebank.merchant.service;

import com.deutschebank.merchant.tradingprocess.Signal;
import com.deutschebank.merchant.tradingprocess.TradingProcessFactory;
import org.springframework.stereotype.Service;

@Service
public class SignalService implements SignalHandler {
  @Override
  public void handleSignal(int signal) {
    TradingProcessFactory.getTradingProcess(Signal.fromInt(signal)).execute();
  }
}
