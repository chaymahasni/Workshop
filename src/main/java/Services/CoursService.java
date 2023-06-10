package Services;

import com.example.firststep.entites.Cours;

import java.util.List;

public interface CoursService {
    public Cours addCour(Cours cours);
    public List<Cours> getAll();
    public  Cours getCoursbyId(Long id);
    public Cours updateCours(Long id  );
    public void deleteCour(Long id);

    Cours retriveCours(Long numCours);
}
