package com.deutschebank.merchant.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc(addFilters = false)
public class SignalControllerIntegrationTest {
  @Autowired
  private WebApplicationContext webApplicationContext; 
  private MockMvc mockMvc;

  @BeforeEach
  public void setup() throws Exception {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
  }

  @Test
  void integerValueShouldReturn200() throws Exception {
    this.mockMvc.perform(MockMvcRequestBuilders.put("/api/signal/1"))
      .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
  }

  @Test
  void stringValueShouldReturn400() throws Exception {
    this.mockMvc.perform(MockMvcRequestBuilders.put("/api/signal/asd"))
      .andExpect(MockMvcResultMatchers.status().isBadRequest()).andReturn();
  }

  @Test
  void nullValueShouldReturn404() throws Exception {
    this.mockMvc.perform(MockMvcRequestBuilders.put("/api/signal"))
      .andExpect(MockMvcResultMatchers.status().isNotFound()).andReturn();
  }

  @Test
  void wrongHttpVerbShouldReturn404() throws Exception {
    this.mockMvc.perform(MockMvcRequestBuilders.get("/api/signal"))
      .andExpect(MockMvcResultMatchers.status().isNotFound()).andReturn();
  }
}
