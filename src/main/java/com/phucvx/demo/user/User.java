package com.phucvx.demo.user;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String username;
    private String password;
}
