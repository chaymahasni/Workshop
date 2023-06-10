package Services;

import com.example.firststep.entites.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SkieurServiceEmpimplements ISkieurService {

    @Autowired
    public ISkieurRepo skieurRepo;
    @Autowired
    public IPisteRepo pisteRepo;
    @Autowired
    public IInscriptionRepo inscriptionRepo;
    @Autowired
    public ICoursService coursService;

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepo.save(skieur);
    }

    @Override
    public List<Skieur> getAll() {
        return skieurRepo.findAll();
    }

    @Override
    public Skieur getSkieurbyId(Long id) {
        Skieur s = skieurRepo.findById(id).get();
        log.info("le nom de skieur est" + s.getNomS());


        return skieurRepo.findById(id).get();
    }

    @Override
    public Skieur updateSkieur(Long id) {
        Skieur sk = skieurRepo.findById(id).get();
        return skieurRepo.save(sk);
    }


    @Override
    public void deleteSkieur(Long id) {
        skieurRepo.deleteById(id);

    }


    @Override
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {

        Skieur skieur = skieurRepo.findById(numSkieur).get();
        Piste piste = pisteRepo.findById(numPiste).get();
        skieur.getPisteList().add(piste);
        Skieur s = skieurRepo.save(skieur);
        log.info("skieur" + s);
        return skieurRepo.save(skieur);
    }


    @Override
    public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours) {
        //Récupération du cours à travers son identifiant
        Cours cours = coursService.retriveCours(numCours);
        Abonnement abonnement = new Abonnement();
        abonnement = skieur.getAbonnement();
        abonnement.setDateDebut(LocalDate.now());
        skieur.setAbonnement(abonnement);

        List<Inscription> inscriptions = new ArrayList<Inscription>();

        inscriptions = skieur.getInscrit();
        inscriptions.forEach(inscription -> {
            inscription.setCours(cours);
            inscription.setSkieur(skieur);
            inscriptionRepo.save(inscription);
        });

        return skieurRepo.save(skieur);
    }

