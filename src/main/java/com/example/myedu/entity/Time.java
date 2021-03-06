package com.example.myedu.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Time {
    @Id
    @GeneratedValue
    private int timeId;
    private String weekDay;

    @OneToMany(mappedBy = "time", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Class> classes;
}
