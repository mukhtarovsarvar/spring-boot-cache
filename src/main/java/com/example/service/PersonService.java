package com.example.service;

import com.example.dto.PersonResponseDTO;
import com.example.entity.Person;
import com.example.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 'Mukhtarov Sarvarbek' on 9/4/2024
 * @project spring-boot-cache
 * @contact @sarvargo
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public PersonResponseDTO findById(Integer id) {
        log.info("Find person by id: {}", id);
        return PersonResponseDTO.toDTO(
                personRepository
                        .findById(id)
                        .orElseThrow(() -> new RuntimeException("Person not found"))
        );
    }
}
