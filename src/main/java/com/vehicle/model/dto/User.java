package com.vehicle.model.dto;

import javax.persistence.Embeddable;

@Embeddable
public class User {

    String firstName;
    String lastName;


    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
