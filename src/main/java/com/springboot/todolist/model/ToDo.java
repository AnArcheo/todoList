package com.springboot.todolist.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "todo")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String description;

    @Enumerated(EnumType.STRING)
    @Column(length=9)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(length=12)
    private Priority priority;
    @Column
    private boolean isCompleted;
    @Column
    private Instant createdDate;
    @Column
    private Instant modifiedDate;

    @Autowired
    public ToDo(String description, Status status, Priority priority,
                boolean isCompleted){
        super();
        createdDate = Instant.now();
        modifiedDate = Instant.now();
    }

}