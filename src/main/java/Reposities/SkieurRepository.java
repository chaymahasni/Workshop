package Reposities;

import com.example.firststep.entites.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {

    public  Skieur findByNomSAndPrenomS(String nom , String prenom);

    public List<Skieur> findByDateNaissanceGreaterThan(Date dateNaissance);
    public  Skieur findByNomSAndPrenomSAndDateNaissance(String nom , String Prenom ,Date dateNaissance  );
    @Query("select s from Skieur s where s.nomS =:nom and s.prenomS =:prenom " )
    public  Skieur getSkieurByNomSAndAndPrenomS(@Param("nom") String nom , @Param("prenom") String prenom);

}
