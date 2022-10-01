package com.sda.vasilebogdanflorin.petclinic.controller;

import com.sda.vasilebogdanflorin.petclinic.model.Vet;
import com.sda.vasilebogdanflorin.petclinic.service.VetService;

import java.util.Scanner;

public class VetController {
    private final Scanner scanner=new Scanner(System.in);
  public final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    public void createVet(){
        System.out.println("Please insert vet first name: ");
        String firstName=scanner.nextLine();

        System.out.println("Please insert vet last name: ");
        String lastName=scanner.nextLine();

        System.out.println("Please insert vet address");
        String address=scanner.nextLine();

        System.out.println("Please insert vet speciality");
        String speciality=scanner.nextLine();

        try{
            vetService.createVet(firstName,lastName,address,speciality);
        }catch (IllegalArgumentException e){
            System.out.println("Invalid data: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Internal Server error "+e.getMessage());
        }
    }
    public void showAllVets(){
        System.out.println("Vet list: ");
        for (Vet vet : vetService.getAllVets()){
            System.out.println(vet.getId()+ " "+ vet.getFirstName()+" "+vet.getLastName());
        }
    }
}
