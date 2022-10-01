package com.sda.vasilebogdanflorin.petclinic;

import com.sda.vasilebogdanflorin.petclinic.controller.VetController;
import com.sda.vasilebogdanflorin.petclinic.repository.VetRepositoryImp;
import com.sda.vasilebogdanflorin.petclinic.service.VetServiceImpl;
import com.sda.vasilebogdanflorin.petclinic.utils.SessionManager;
import com.sda.vasilebogdanflorin.petclinic.utils.UserOption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();
        VetController vetController=new VetController(new VetServiceImpl(new VetRepositoryImp()));

        UserOption userOption;
        Scanner scanner=new Scanner(System.in);
        do {
            try{
                UserOption.displayAllOption();
                System.out.println("Please select an option: ");
                int numericOption=Integer.parseInt(scanner.nextLine().trim());
                userOption=UserOption.findByNumericOption(numericOption);
            }catch (NumberFormatException e){
                userOption=UserOption.UNKNOWN;
            }

            switch (userOption){
                case ADD_VET :
                    vetController.createVet();
                    break;
                case VIEW_ALL_VETS:
                    vetController.showAllVets();
                    break;
                case VIEW_VET_BY_ID:
                    vetController.showVetById();
                    break;
                case UNKNOWN:
                    System.err.println("Invalid option selected");
                    break;
                case EXIT:
                    System.out.println("Bye");
                    break;
            }
        }while(userOption!=UserOption.EXIT);
        SessionManager.shutDown();
    }
}
