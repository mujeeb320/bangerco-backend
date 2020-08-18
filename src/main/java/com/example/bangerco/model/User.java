package com.example.bangerco.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")

public class User {

    @Id
    @GeneratedValue
    private String userId;
    private String name;
    private String email;
    private String password;
    private int NIC;
    private Date DOB;
    private int noOfRentals;
    private String roleType;
}
