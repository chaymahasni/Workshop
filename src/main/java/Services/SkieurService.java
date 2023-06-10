package Services;

import com.example.firststep.entites.Skieur;

import java.util.List;

public interface SkieurService {
    public Skieur addSkieur(Skieur skieur);
    public List<Skieur> getAll();
    public  Skieur getSkieurbyId(Long id);
    public Skieur updateSkieur(Long id  );

    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste);

    public void deleteSkieur(Long id);

    Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours);
}
