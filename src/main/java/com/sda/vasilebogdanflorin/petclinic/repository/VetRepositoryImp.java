package com.sda.vasilebogdanflorin.petclinic.repository;
import com.sda.vasilebogdanflorin.petclinic.model.Vet;
import com.sda.vasilebogdanflorin.petclinic.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VetRepositoryImp implements VetRepository{
        @Override
        public void createVet(String firstName, String lastName, String address, String speciality) {
            Transaction transaction = null;
            try (Session session = SessionManager.getSessionFactory().openSession()) {
                transaction = session.beginTransaction();
                Vet vet = new Vet();
                vet.setFirstName(firstName);
                vet.setLastName(lastName);
                vet.setAddress(address);
                vet.setSpeciality(speciality);
                session.save(vet);
                transaction.commit();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                transaction.rollback();
            }
        }
    }


