package com.thouradev.message.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessageController {

  @GetMapping(value = {"", "/message"})
  public String getMessage(@RequestParam(name = "message", required = false, defaultValue = "Docker") String message) {
    log.info("method=getMessage message={}", message);
    return String.format("Message -> CI : Hello from %s!", message);
  }

}
