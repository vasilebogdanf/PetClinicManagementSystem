package com.sda.vasilebogdanflorin.petclinic.controller;

import com.sda.vasilebogdanflorin.petclinic.service.ConsultService;

import java.sql.Date;
import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConsultController {

    Scanner scanner=new Scanner(System.in);

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MM-dd-yyyy");
    private final ConsultService consultService;

    public ConsultController(ConsultService consultService) {
        this.consultService = consultService;
    }

    public void createConsult(){
        try{
            System.out.println("Please insert the vet id: ");
            int vetId= Integer.parseInt(scanner.nextLine());
            System.out.println("Please insert the pet id: ");
            int petId=Integer.parseInt(scanner.nextLine());
            System.out.println("Please insert the date of the consult:");
            Date date=Date.valueOf(LocalDate.parse(scanner.nextLine(),FORMATTER));
            System.out.println("Please insert the description consult: ");
            String description=scanner.nextLine();
            consultService.createConsult(vetId,petId,date,description);
        }catch (IllegalArgumentException | DateTimeException  e){
            System.out.println("Invalid data "+e.getMessage());
        }catch (Exception e){
            System.out.println("Internal Server error"+ e.getMessage());
        }
    }
}
