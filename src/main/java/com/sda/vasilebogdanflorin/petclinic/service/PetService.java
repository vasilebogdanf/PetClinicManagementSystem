package com.sda.vasilebogdanflorin.petclinic.service;

import java.io.IOException;
import java.sql.Date;

public interface PetService {

    void createPet(String race, Date birthdate, boolean isVaccinated, String ownername);

    void importPets() throws IOException;

}
