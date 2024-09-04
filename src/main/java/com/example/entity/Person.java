package com.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;


/**
 * @author Admin on 9/3/2024
 * @project spring-boot-cache
 * @package com.example.entity
 * @contact @sarvargo
 */

@Getter
@Setter
@Entity
@Table(name = "person")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
