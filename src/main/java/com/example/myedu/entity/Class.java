package com.example.myedu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Class {
    @Id
    @GeneratedValue
    private int classId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "teacherUserId")
    @JsonIgnore
    private User user;
    @Column(name = "teacherUserId", insertable = false, updatable = false)
    private int userId;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    @JsonIgnore
    private Subject subject;
    @Column(name = "subjectId", insertable = false, updatable = false)
    private int subjectId;

    @ManyToOne
    @JoinColumn(name = "roomId")
    @JsonIgnore
    private Room room;
    @Column(name = "roomId", insertable = false, updatable = false)
    private int roomId;

    @ManyToOne
    @JoinColumn(name = "timeId")
    @JsonIgnore
    private Time time;
    @Column(name = "timeId", insertable = false, updatable = false)
    private int timeId;

//    @ManyToMany(mappedBy = "classes2")
//    @JsonIgnore
//    private Set<User> users;

    @OneToMany(mappedBy = "aClass", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Enrollment> enrollments;
}
