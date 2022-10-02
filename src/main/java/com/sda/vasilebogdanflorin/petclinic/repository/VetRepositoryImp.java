package com.sda.vasilebogdanflorin.petclinic.repository;

import com.sda.vasilebogdanflorin.petclinic.model.Vet;


public class VetRepositoryImp extends BaseRepositoryImpl<Vet> implements VetRepository {

    public VetRepositoryImp() {
        super(Vet.class);
    }
    @Override
    public void createVet(String firstName, String lastName, String address, String speciality) {
        Vet vet = new Vet();
        vet.setFirstName(firstName);
        vet.setLastName(lastName);
        vet.setAddress(address);
        vet.setSpeciality(speciality);
        create(vet);
    }

    @Override
    public void updateVetById(int id, String firstName, String lastName, String address, String speciality) {
        Vet vet = new Vet();
        vet.setFirstName(firstName);
        vet.setId(id);
        vet.setLastName(lastName);
        vet.setAddress(address);
        vet.setSpeciality(speciality);

        updateById(id, vet);
    }
}


