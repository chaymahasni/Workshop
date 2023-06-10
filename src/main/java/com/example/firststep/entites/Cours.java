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
public class Cours {

    @Id
    private Long num_cour;
    private String VERT;

    private String BLEU;
    private String ROUGE;
    private String NOIR;

    public Cours() {
    }

    public Cours(Long num_cour, String VERT, String BLEU, String ROUGE, String NOIR, List<Inscription> inscrit) {
        this.num_cour = num_cour;
        this.VERT = VERT;
        this.BLEU = BLEU;
        this.ROUGE = ROUGE;
        this.NOIR = NOIR;
        this.inscrit = inscrit;
    }

    public void setNum_cour(Long num_cour) {
        this.num_cour = num_cour;
    }

    public void setVERT(String VERT) {
        this.VERT = VERT;
    }

    public void setBLEU(String BLEU) {
        this.BLEU = BLEU;
    }

    public void setROUGE(String ROUGE) {
        this.ROUGE = ROUGE;
    }

    public void setNOIR(String NOIR) {
        this.NOIR = NOIR;
    }

    public void setInscrit(List<Inscription> inscrit) {
        this.inscrit = inscrit;
    }

    public Long getNum_cour() {
        return num_cour;
    }

    public String getVERT() {
        return VERT;
    }

    public String getBLEU() {
        return BLEU;
    }

    public String getROUGE() {
        return ROUGE;
    }

    public String getNOIR() {
        return NOIR;
    }

    public List<Inscription> getInscrit() {
        return inscrit;
    }

    @OneToMany(mappedBy = "cours")
    private List<Inscription> inscrit;

}
