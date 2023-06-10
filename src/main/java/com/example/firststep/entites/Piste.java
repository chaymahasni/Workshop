package com.example.firststep.entites;

import com.example.firststep.enu.Couleur;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Piste {

    @Id
    private Long numPiste ;
    private  String nomPiste;
    private Couleur couleur;

    public Piste() {
    }

    public Piste(Long numPiste, String nomPiste, Couleur couleur, List<Skieur> skieurList) {
        this.numPiste = numPiste;
        this.nomPiste = nomPiste;
        this.couleur = couleur;
        this.skieurList = skieurList;
    }

    public void setNumPiste(Long numPiste) {
        this.numPiste = numPiste;
    }

    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public void setSkieurList(List<Skieur> skieurList) {
        this.skieurList = skieurList;
    }

    public Long getNumPiste() {
        return numPiste;
    }

    public String getNomPiste() {
        return nomPiste;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public List<Skieur> getSkieurList() {
        return skieurList;
    }

    @ManyToMany
    private List<Skieur> skieurList;
}
