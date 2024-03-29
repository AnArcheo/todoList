package com.springboot.todolist.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users") // do not use name 'user' that is the reserved sql keyword
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(length=20)
    private String username;
    @Column(length=20)
    private String passwords;

}