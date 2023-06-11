package com.deutschebank.merchant.tradingprocess;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Signal {
  One(1), Two(2), Three(3), Undefined(null);

  private final Integer value;  
  
  private Signal(Integer value) {
    this.value = value;
  }  

  public Integer getValue() {
    return value;
  }

  private static Map<Integer, Signal> reverseLookup =
      Arrays
      .stream(Signal.values()).collect(Collectors.toMap(Signal::getValue, Function.identity()));

  public static Signal fromInt(final Integer id) {
    return reverseLookup.getOrDefault(id, Undefined);
  }
}
