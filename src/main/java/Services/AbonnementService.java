package Services;

import com.example.firststep.entites.Abonnement;
import com.example.firststep.enu.TypeAbonnement;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementService implements IAbonnemetService{


    @Autowired
    IAbonnementRepo abonnementRepo ;
    @Override
    public List<Abonnement> getListByTypeAbonnement(TypeAbonnement typeAbonnement) {
        return abonnementRepo.findByTypeAbonnement(typeAbonnement);
    }

    @Override
    public List<Abonnement> getListByAbonnementByDates(LocalDate dateDebut, LocalDate dateFin) {
        return abonnementRepo.getAbonnementByDateDebutBetween(dateDebut , dateFin);
    }

    @Override
    public List<Abonnement> findByTypeAbonnementOrderByDateDebut(TypeAbonnement typeAbonnement) {
        return abonnementRepo.findByTypeAbonnement(typeAbonnement);
    }



}

