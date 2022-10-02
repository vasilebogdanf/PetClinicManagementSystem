package com.sda.vasilebogdanflorin.petclinic.repository;

import com.sda.vasilebogdanflorin.petclinic.model.Consult;
import com.sda.vasilebogdanflorin.petclinic.model.Pet;
import com.sda.vasilebogdanflorin.petclinic.model.Vet;

import java.sql.Date;

public interface ConsultRepository extends  BaseRepository<Consult>{
    void createConsult(Vet vet, Pet pet, Date date, String description);
}



