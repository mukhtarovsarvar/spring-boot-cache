package com.example.controller;

import com.example.dto.PersonResponseDTO;
import com.example.entity.Person;
import com.example.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 'Mukhtarov Sarvarbek' on 9/4/2024
 * @project spring-boot-cache
 * @contact @sarvargo
 */
@Slf4j
@RestController
@RequestMapping("/api/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping("/{id}")
    public PersonResponseDTO getPerson(@PathVariable Integer id) {
        return personService.findById(id);
    }
}
