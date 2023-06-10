package Services;

import com.example.firststep.entites.Abonnement;
import com.example.firststep.enu.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

public class AbonnementServiceEmp {
    List<Abonnement> getListByTypeAbonnement(TypeAbonnement typeAbonnement);
    public  List<Abonnement> getListByAbonnementByDates(LocalDate dateDebut, LocalDate dateFin);

    public  List<Abonnement> findByTypeAbonnementOrderByDateDebut(TypeAbonnement typeAbonnement);

}

}
