package com.deutschebank.merchant.controller;

import com.deutschebank.merchant.service.SignalHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signal")
public class SignalController {
  @Autowired
  private SignalHandler signalService;

  @PutMapping("/{id}")
  public void processSignal(@PathVariable int id) {
    signalService.handleSignal(id);
  }
}
