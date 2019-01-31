package com.sopra.banking.dxp.clientdemo.model.api;

public class ClientDTO {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public ClientDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public ClientDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
