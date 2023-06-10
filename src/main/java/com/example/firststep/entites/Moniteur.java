package com.example.firststep.entites;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Moniteur {

    @Id
    private Long num_moniteur;

    private String nomM;
    private  String prenomM;
    private LocalDate dateRecu;

    public Moniteur(Long num_moniteur, String nomM, String prenomM, LocalDate dateRecu, List<Cours> coursList) {
        this.num_moniteur = num_moniteur;
        this.nomM = nomM;
        this.prenomM = prenomM;
        this.dateRecu = dateRecu;
        this.coursList = coursList;
    }

    public Long getNum_moniteur() {
        return num_moniteur;
    }

    public void setNum_moniteur(Long num_moniteur) {
        this.num_moniteur = num_moniteur;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public void setDateRecu(LocalDate dateRecu) {
        this.dateRecu = dateRecu;
    }

    public void setCoursList(List<Cours> coursList) {
        this.coursList = coursList;
    }

    public String getNomM() {
        return nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public LocalDate getDateRecu() {
        return dateRecu;
    }

    public List<Cours> getCoursList() {
        return coursList;
    }

    public Moniteur() {
    }

    @OneToMany
    private List<Cours> coursList ;


}
