package sample.model;

import java.util.Date;

/**
 * Created by RENT on 2017-04-04.
 */
    public class Person {

        private String firstname;
        private String lastname;
        private String street;
        private String city;
        private String postalcode;
        private Date birthdate;

    public Person(String firstname, String lastname, String street, String city, String postalcode, Date birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.street = street;
        this.city = city;
        this.postalcode = postalcode;
        this.birthdate = birthdate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
