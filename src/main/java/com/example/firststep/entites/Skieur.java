package com.example.firststep.entites;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Skieur {
    @Id
    private Long numSkieur;

   private String nomS;
   private  String prenomS;
   private LocalDate dateNaissance;
   private String ville;

    public Skieur() {
    }

    public Skieur(Long numSkieur, String nomS, String prenomS, LocalDate dateNaissance, String ville, List<Piste> pisteList, List<Inscription> inscrit) {
        this.numSkieur = numSkieur;
        this.nomS = nomS;
        this.prenomS = prenomS;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
        this.pisteList = pisteList;
        this.inscrit = inscrit;
    }

    public Long getNumSkieur() {
        return numSkieur;
    }

    public void setNumSkieur(Long numSkieur) {
        this.numSkieur = numSkieur;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public void setPrenomS(String prenomS) {
        this.prenomS = prenomS;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPisteList(List<Piste> pisteList) {
        this.pisteList = pisteList;
    }

    public void setInscrit(List<Inscription> inscrit) {
        this.inscrit = inscrit;
    }

    public String getNomS() {
        return nomS;
    }

    public String getPrenomS() {
        return prenomS;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public List<Piste> getPisteList() {
        return pisteList;
    }

    public List<Inscription> getInscrit() {
        return inscrit;
    }

    @ManyToMany(mappedBy = "skieurList")
    private List<Piste> pisteList;
@OneToMany(mappedBy = "skieur")
    private  List<Inscription> inscrit;
}
