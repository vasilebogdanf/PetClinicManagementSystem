package com.sda.vasilebogdanflorin.petclinic.service;

import com.sda.vasilebogdanflorin.petclinic.model.Pet;
import com.sda.vasilebogdanflorin.petclinic.model.Vet;
import com.sda.vasilebogdanflorin.petclinic.repository.ConsultRepository;
import com.sda.vasilebogdanflorin.petclinic.repository.PetRepository;
import com.sda.vasilebogdanflorin.petclinic.repository.VetRepository;

import java.sql.Date;
import java.util.Optional;

public class ConsultServiceImpl implements ConsultService{

    private final VetRepository vetRepository;
    private final PetRepository petRepository;
    private final ConsultRepository consultRepository;

    public ConsultServiceImpl(VetRepository vetRepository, PetRepository petRepository, ConsultRepository consultRepository) {
        this.vetRepository = vetRepository;
        this.petRepository = petRepository;
        this.consultRepository = consultRepository;
    }

    @Override
    public void createConsult(int vetId, int petId, Date date, String description) {
        Optional<Vet> vetOptional=vetRepository.findById(vetId);
        if (vetOptional.isPresent()){
            Optional<Pet> petOptional=petRepository.findById(petId);
            if (petOptional.isPresent()){
                consultRepository.createConsult(vetOptional.get(),petOptional.get(),date,description);
            }else {
                throw new IllegalArgumentException("Invalid Pet Id");
            }
        }else{
            throw new IllegalArgumentException("Invalid Vet Id");
        }

    }
}
