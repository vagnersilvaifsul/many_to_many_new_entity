package com.example.many_to_many_new_entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/*
* Baseado em: https://www.baeldung.com/jpa-many-to-many
* */
@Entity
public class Student {
    @Id
    Long id;
    @OneToMany(mappedBy = "student")
    Set<CourseRegistration> courseRegistrations;
}
