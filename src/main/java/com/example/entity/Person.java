package com.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


/**
 * @author Admin on 9/3/2024
 * @project spring-boot-cache
 * @package com.example.entity
 * @contact @sarvargo
 */
@Cacheable
@Getter
@Setter
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
