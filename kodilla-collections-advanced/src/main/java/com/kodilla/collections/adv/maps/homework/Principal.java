package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {

    private String firstname;
    private String lastname;
    private String schoolNumber;


    public Principal(String firstname, String lastname,String schoolNumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.schoolNumber = schoolNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    @Override
    public String toString() {
        return "Principal: " + firstname.toString() + lastname.toString() +  schoolNumber.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstname, principal.firstname)
                && Objects.equals(lastname, principal.lastname)
                && Objects.equals(schoolNumber,principal.schoolNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}
