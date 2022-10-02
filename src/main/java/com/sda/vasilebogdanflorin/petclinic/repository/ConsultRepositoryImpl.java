package com.sda.vasilebogdanflorin.petclinic.repository;

import com.sda.vasilebogdanflorin.petclinic.model.Consult;
import com.sda.vasilebogdanflorin.petclinic.model.Pet;
import com.sda.vasilebogdanflorin.petclinic.model.Vet;

import java.sql.Date;

public class ConsultRepositoryImpl extends BaseRepositoryImpl <Consult> implements ConsultRepository{
    public ConsultRepositoryImpl() {
        super(Consult.class);
    }

    @Override
    public void createConsult(Vet vet, Pet pet, Date date, String description) {
        Consult consult=new Consult();
        consult.setPet(pet);
        consult.setVet(vet);
        consult.setDate(date);
        consult.setDescription(description);
        create(consult);
    }
}
