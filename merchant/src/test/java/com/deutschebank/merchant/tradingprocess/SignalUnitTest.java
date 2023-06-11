package com.deutschebank.merchant.tradingprocess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SignalUnitTest {
  @Test
  void fromIntOneShouldBeEqualToEnumSignalOne() {
    assertEquals(Signal.fromInt(1), Signal.One);
  }

  @Test
  void fromIntTwoShouldBeEqualToEnumSignalTwo() {
    assertEquals(Signal.fromInt(2), Signal.Two);
  }

  @Test
  void fromIntThreeShouldBeEqualToEnumSignalThree() {
    assertEquals(Signal.fromInt(3), Signal.Three);
  }

  @Test
  void fromIntUndefinedShouldBeEqualToEnumSignalUndefined() {
    assertEquals(Signal.fromInt(Integer.MAX_VALUE), Signal.Undefined);
  }

  @Test
  void fromIntNullShouldBeEqualToEnumSignalUndefined() {
    assertEquals(Signal.fromInt(null), Signal.Undefined);
  }
}
