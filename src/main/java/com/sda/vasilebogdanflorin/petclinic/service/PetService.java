package com.sda.vasilebogdanflorin.petclinic.service;

import java.sql.Date;

public interface PetService {

    void createPet(String race, Date birthdate, boolean isVaccinated, String ownername);


}
