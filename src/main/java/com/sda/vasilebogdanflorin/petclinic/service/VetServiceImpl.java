package com.sda.vasilebogdanflorin.petclinic.service;

import com.sda.vasilebogdanflorin.petclinic.model.Vet;
import com.sda.vasilebogdanflorin.petclinic.repository.VetRepository;
import com.sda.vasilebogdanflorin.petclinic.service.VetService;

import java.util.List;
import java.util.Optional;

public class VetServiceImpl implements VetService {
    private final VetRepository vetRepository;

    public VetServiceImpl(VetRepository vetRepository) {

        this.vetRepository = vetRepository;
    }

    @Override
    public void createVet(String firstName, String lastName, String address, String speciality) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalStateException("First name is invalid");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalStateException("Last name is invalid");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalStateException("First name is invalid");
        }
        if (speciality == null || speciality.isBlank()) {
            throw new IllegalStateException("First name is invalid");
        }
        vetRepository.createVet(firstName, lastName, address, speciality);
    }

    @Override
    public List<Vet> getAllVets() {
        return vetRepository.getAll();
    }

    @Override
    public Optional<Vet> findById(int id) {
        return vetRepository.findById(id);
    }

    @Override
    public void updateVetById(int id, String firstName, String lastName, String address, String speciality) {
        if (id < 0) {
            throw new IllegalStateException("Id is invalid");
        }
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalStateException("First name is invalid");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalStateException("Last name is invalid");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalStateException("First name is invalid");
        }
        if (speciality == null || speciality.isBlank()) {
            throw new IllegalStateException("First name is invalid");
        }
        vetRepository.updateVetById(id, firstName, lastName, address, speciality);
    }

    @Override
    public void deleteById(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id is invalid");
        }
        vetRepository.deleteById(id);
    }
}


