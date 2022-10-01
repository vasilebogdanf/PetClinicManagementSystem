package com.sda.vasilebogdanflorin.petclinic.repository;

public interface VetRepository {
    void createVet(String firstName, String lastName, String address, String speciality);

}
