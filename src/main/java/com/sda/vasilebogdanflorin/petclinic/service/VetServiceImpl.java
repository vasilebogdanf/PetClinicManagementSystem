package com.sda.vasilebogdanflorin.petclinic.service;

import com.sda.vasilebogdanflorin.petclinic.repository.VetRepository;
import com.sda.vasilebogdanflorin.petclinic.service.VetService;

public class VetServiceImpl implements VetService{
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
}

