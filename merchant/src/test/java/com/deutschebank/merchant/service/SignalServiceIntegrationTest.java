package com.deutschebank.merchant.service;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc(addFilters = false)
public class SignalServiceIntegrationTest {
  @Autowired
  private SignalService signalService;

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  void signalOneProcessSteps() {
    signalService.handleSignal(1);
    assertEquals("""
        setUp
        setAlgoParam 1,60
        performCalc
        submitToMarket
        doAlgo
        """, outContent.toString());
  }

  @Test
  void signalTwoProcessSteps() {
    signalService.handleSignal(2);
    assertEquals("""
        reverse
        setAlgoParam 1,80
        submitToMarket
        doAlgo
        """, outContent.toString());
  }

  @Test
  void signalThreeProcessSteps() {
    signalService.handleSignal(3);
    assertEquals("""
        setAlgoParam 1,90
        setAlgoParam 2,15
        performCalc
        submitToMarket
        doAlgo
        """, outContent.toString());
  }

  @Test
  void signalUndefinedProcessSteps() {
    signalService.handleSignal(Integer.MAX_VALUE);
    assertThat(outContent.toString(), containsString("""
        cancelTrades
        doAlgo
        """));
  }
}
