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
@Table(name="customer")

public class Customer {

    @Id
    @GeneratedValue
    private int customerId;
    private String name;
    private int NIC;
    private Date DOB;
    private int noOfRentals;
}
