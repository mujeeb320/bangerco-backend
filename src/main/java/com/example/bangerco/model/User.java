package com.example.bangerco.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")

public class User {

    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String email;
    private String password;
    private String roleType;
    private int NIC;
    @JsonFormat(pattern="dd/mm/yyyy")
    private Date DOB;



}
