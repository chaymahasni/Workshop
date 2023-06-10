package Reposities;

import com.example.firststep.entites.Abonnement;
import com.example.firststep.enu.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRepository {

    @Repository
    public interface IAbonnementRepo extends JpaRepository<Abonnement,Long> {
        List<Abonnement> findByTypeAbonnement(TypeAbonnement typeAbonnement);
        @Query("SELECT a FROM Abonnement  a WHERE a.typeAbonnement=:typeAbonnement")
        List<Abonnement> getAbonnementByTypeAbonnement(@Param("typeAbonnement")TypeAbonnement typeAbonnement);

        List<Abonnement> getAbonnementByDateDebutBetween(LocalDate dateDebut, LocalDate dateFin );
    }




}
