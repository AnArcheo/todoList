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
    private Status status;
    private Priority priority;
    private boolean isCompleted;
    private Instant createdDate;
    private Instant modifiedDate;
    private Instant endDate;

    private String timeLeft;

    @Autowired
    public ToDo(String description, Status status, Priority priority,
                boolean isCompleted, Instant createdDate, Instant modifiedDate,
                Instant endDate, String timeLeft){
        super();
        createdDate = Instant.now();
        modifiedDate = Instant.now();
    }


}