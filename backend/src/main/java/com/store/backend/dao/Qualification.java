package com.store.backend.dao;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
}
