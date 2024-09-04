package com.example.dto;

import com.example.entity.Person;

/**
 * @author 'Mukhtarov Sarvarbek' on 9/4/2024
 * @project spring-boot-cache
 * @contact @sarvargo
 */
public record PersonResponseDTO(
        Integer id,
        String name
) {

    public static PersonResponseDTO toDTO(Person person) {
        return new PersonResponseDTO(person.getId(), person.getName());
    }
}
