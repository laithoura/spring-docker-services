package com.thouradev.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CustomerController {

  @GetMapping(value = {"", "/message"})
  public String getMessage(@RequestParam(name = "message", required = false, defaultValue = "Docker") String message) {

    log.info("method=getMessage message={}", message);
    return String.format("Customer: Hello from %s!", message);

  }

}
