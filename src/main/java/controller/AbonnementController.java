package controller;

import com.example.firststep.entites.Abonnement;
import com.example.firststep.enu.TypeAbonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
@RestController
@RequestMapping("/abonnement")
public class AbonnementController {
    @Autowired
    public AbonnementController abonnemetService;

    @GetMapping("/type/{type}")
    List<Abonnement> getAbonnementsByTypeOrderedByDate(TypeAbonnement typeAbonnement) {
        return abonnemetService.findByTypeAbonnementOrderByDateDebut(typeAbonnement);
    }

    private List<Abonnement> findByTypeAbonnementOrderByDateDebut(TypeAbonnement typeAbonnement) {
    }

    @GetMapping("/dates")
    public List<Abonnement> getListByAbonnementByDates(LocalDate dateDebut, LocalDate dateFin) {
        return abonnemetService.getListByAbonnementByDates(dateDebut , dateFin);
    }
}
