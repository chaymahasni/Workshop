package com.example.firststep.entites;


import com.example.firststep.enu.TypeAbonnement;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Abonnement {

    @Id
    private Long numAbon;
    private LocalDate dateDebut ;
    private LocalDate dateFin;
    private   Float  prixAbon;
    private TypeAbonnement typeAbonnement;



}
