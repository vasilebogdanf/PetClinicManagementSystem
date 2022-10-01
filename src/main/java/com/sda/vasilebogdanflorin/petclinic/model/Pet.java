package com.sda.vasilebogdanflorin.petclinic.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table (name="pet")
public class Pet {

    @Id
    @Column (name="id")
    private int id;
    @Column(name="race")
    private String race;
    @Column (name="birthdate")
    private Date date;
    @Column (name="is_vaccinated")
    private boolean isVaccinated;
    @Column (name="owner_name")
    private String ownerName;

    public void setId(int id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "pet")
    private List<Consult> consults;




    public void setConsults(List<Consult> consults) {
        this.consults = consults;
    }

    public List<Consult> getConsults() {
        return consults;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", race='" + race + '\'' +
                ", date=" + date +
                ", isVaccinated=" + isVaccinated +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getId() {
        return id;
    }

    public String getRace() {
        return race;
    }

    public Date getDate() {
        return date;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Pet(int id, String race, Date date, boolean isVaccinated, String ownerName) {
        this.id = id;
        this.race = race;
        this.date = date;
        this.isVaccinated = isVaccinated;
        this.ownerName = ownerName;
    }
}