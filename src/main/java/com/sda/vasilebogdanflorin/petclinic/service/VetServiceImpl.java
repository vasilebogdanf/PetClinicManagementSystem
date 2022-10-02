package com.sda.vasilebogdanflorin.petclinic.service;

import com.sda.vasilebogdanflorin.petclinic.model.Vet;
import com.sda.vasilebogdanflorin.petclinic.repository.VetRepository;
import com.sda.vasilebogdanflorin.petclinic.service.VetService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    @Override
    public void importVets() throws IOException {
        Path filePath = Paths.get("C:\\Users\\Alexa\\Documents\\GitHub\\PetClinicManagementSystem\\src\\main\\resources\\Data\\Vets.txt");
        Files.lines(filePath)
                .skip(1)
                .map(line-> line.split("\\|"))
                .forEach(lineElements->{
                    if(lineElements.length==4){
                        String firstName=lineElements[0];
                        String lastName=lineElements[1];
                        String address=lineElements[2];
                        String speciality=lineElements[3];
                        createVet(firstName,lastName,address,speciality);
                    }
                });



    }


}


