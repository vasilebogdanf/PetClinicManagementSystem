package com.sda.vasilebogdanflorin.petclinic.repository;

import com.sda.vasilebogdanflorin.petclinic.model.Pet;

import java.sql.Date;

public class PetRepositoryImpl extends BaseRepositoryImpl<Pet> implements PetRepository{

    public PetRepositoryImpl() {
        super(Pet.class);
    }

    @Override
    public void createPet(String race, Date birthdate, boolean isVaccinated, String ownername) {
        Pet pet=new Pet();
        pet.setRace(race);
        pet.setDate(birthdate);
        pet.setVaccinated(isVaccinated);
        pet.setOwnerName(ownername);
        create(pet);
    }
    @Override
    public void updatePet(int id, String race, Date birthdate, boolean isVaccinated, String ownername) {
        Pet pet=new Pet();
        pet.setRace(race);
        pet.setId(id);
        pet.setDate(birthdate);
        pet.setVaccinated(isVaccinated);
        pet.setOwnerName(ownername);
        updateById(id,pet);
    }
}
