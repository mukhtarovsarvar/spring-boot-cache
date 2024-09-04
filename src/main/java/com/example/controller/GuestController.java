package com.example.controller;

import com.example.service.GuestService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin on 6/30/2024
 * @project spring-boot-cache
 * @package com.example.controller
 * @contact @sarvargo
 */
@RestController
@Slf4j
public class GuestController {

    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping("/hello-cache")
    public ResponseEntity<String> helloWithCache(){
        return ResponseEntity.ok(guestService.helloWithCache());
    }

    @GetMapping("/hello")
    public ResponseEntity<String> helloWithOutCache(){
        return ResponseEntity.ok(guestService.helloWithOutCache());
    }
}
