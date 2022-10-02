package com.sda.vasilebogdanflorin.petclinic.service;

import com.sda.vasilebogdanflorin.petclinic.model.Vet;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface VetService {
    void createVet (String firstName, String lastName, String address, String speciality);

    List<Vet> getAllVets();

    Optional<Vet> findById(int id);

    void updateVetById(int id, String firstName, String lastName, String address, String speciality);

    void deleteById(int id);

    void importVets() throws IOException;
}
