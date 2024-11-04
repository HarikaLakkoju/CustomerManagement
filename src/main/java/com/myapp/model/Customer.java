package com.myapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CustomerTable")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
