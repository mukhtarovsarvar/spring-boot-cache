package com.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Admin on 6/30/2024
 * @project spring-boot-cache
 * @package com.example.service
 * @contact @sarvargo
 */
@Service
@Slf4j
public class GuestService {

    @Cacheable(value = "message")
    public String helloWithCache(){
        log.info("helloWithCache....");
        return "With Cache";
    }
    public String helloWithOutCache(){
        log.info("helloWithOutCache...");
        return "With out cache";
    }
}
