package com.sda.vasilebogdanflorin.petclinic.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table (name="vet")
public class Vet {
   @Id
    private int id;

   @Column(name="first_name")
    private String firstName;
   @Column (name="last_name")
    private String lastName;
   @Column (name="address")
    private String address;
   @Column (name="speciality")
    private String speciality;

    @OneToMany(mappedBy = "vet")
    private List<Consult> consults;


    public List<Consult> getConsults() {
        return consults;
    }

    public void setConsults(List<Consult> consults) {
        this.consults = consults;
    }

    private Vet(){

   }


    public Vet(int id, String firstName, String lastName, String address, String speciality) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Vet{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
