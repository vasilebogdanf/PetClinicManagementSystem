package com.sda.vasilebogdanflorin.petclinic.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table (name="pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")
    private Integer id;
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


    public Pet() {

    }

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
                ", consults=" + consults +
                '}';
    }

    public Pet(Integer id, String race, Date date, boolean isVaccinated, String ownerName, List<Consult> consults) {
        this.id = id;
        this.race = race;
        this.date = date;
        this.isVaccinated = isVaccinated;
        this.ownerName = ownerName;
        this.consults = consults;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getId() {
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
}
