package com.sda.vasilebogdanflorin.petclinic.repository;

import com.sda.vasilebogdanflorin.petclinic.model.Pet;

import java.sql.Date;

public interface PetRepository extends BaseRepository<Pet> {

    void createPet(String race, Date birthdate, boolean isVaccinated, String ownername);

    void updatePet(int id, String race, Date birthdate, boolean isVaccinated, String ownername);

}
