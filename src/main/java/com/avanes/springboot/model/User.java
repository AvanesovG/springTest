package com.avanes.springboot.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firsName;
    @Column(name = "last_name")
    private String lastName;


}
