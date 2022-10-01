package com.sda.vasilebogdanflorin.petclinic;

import com.sda.vasilebogdanflorin.petclinic.controller.VetController;
import com.sda.vasilebogdanflorin.petclinic.repository.VetRepositoryImp;
import com.sda.vasilebogdanflorin.petclinic.service.VetServiceImpl;
import com.sda.vasilebogdanflorin.petclinic.utils.SessionManager;

public class Main {
    public static void main(String[] args) {
        VetController vetController=new VetController(new VetServiceImpl(new VetRepositoryImp()));
        vetController.createVet();
    }
}
