package com.example.firststep.entites;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Inscription {


    @Id
    private Long numInscription;
private int numSemaine ;
@ManyToOne
    private  Skieur skieur;

    public Inscription() {
    }

    public Inscription(Long numInscription, int numSemaine, Skieur skieur, Cours cours) {
        this.numInscription = numInscription;
        this.numSemaine = numSemaine;
        this.skieur = skieur;
        this.cours = cours;
    }

    public Long getNumInscription() {
        return numInscription;
    }

    public int getNumSemaine() {
        return numSemaine;
    }

    public Skieur getSkieur() {
        return skieur;
    }

    public void setNumInscription(Long numInscription) {
        this.numInscription = numInscription;
    }

    public void setNumSemaine(int numSemaine) {
        this.numSemaine = numSemaine;
    }

    public void setSkieur(Skieur skieur) {
        this.skieur = skieur;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Cours getCours() {
        return cours;
    }

    @ManyToOne
    private  Cours cours;

}
