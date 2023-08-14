package com.fullstack_backend.employeesystemapi.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
//@Table(name="final_table")
// The table name which was automatically created was this class name, if we eant explicitely another name, then we use the @Table annotation.
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
