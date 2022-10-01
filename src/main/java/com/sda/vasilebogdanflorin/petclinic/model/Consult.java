package com.sda.vasilebogdanflorin.petclinic.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name="consult")
public class Consult {

    @Id
    @Column(name="id")
    private int id;
    @Column(name="date")
    private Date date;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name="vet_id")
    private Vet vet;

    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;



    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Consult{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Consult(int id, Date date, String description) {
        this.id = id;
        this.date = date;
        this.description = description;
    }
}
