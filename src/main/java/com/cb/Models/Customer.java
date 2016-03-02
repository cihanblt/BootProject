package com.cb.Models;

import javax.persistence.*;

/**
 * Created by cihan on 2.03.2016.
 */
@Entity
@Table(name = "TBL_CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue
    private long recordId;

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    public Customer() {

    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "recordId=" + recordId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


}
