package com.sda.vasilebogdanflorin.petclinic;

import com.sda.vasilebogdanflorin.petclinic.utils.SessionManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        SessionManager.getSessionFactory();
        SessionManager.shutDown();
    }
}
