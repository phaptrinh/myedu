package com.example.myedu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Enrollment {
    @Id
    @GeneratedValue
    private int enrollmentId;

    @ManyToOne
    @JoinColumn(name = "classId")
    private Class aClass;

    @ManyToOne
    @JoinColumn(name = "studentUserId")
    private User user;
}
