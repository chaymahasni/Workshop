package Services;

import com.example.firststep.entites.Cours;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CourServiceEmp implements ICoursService{
    @Autowired
    public ICoursRepo coursRepo;




    @Override
    public Cours addCour(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public List<Cours> getAll() {
        return coursRepo.findAll();
    }

    @Override
    public Cours getCoursbyId(Long id) {
        Cours cours = coursRepo.findById(id).get();



        return coursRepo.findById(id).get() ;
    }

    @Override
    public Cours updateCours(Long id) {
        Cours cours  = coursRepo.findById(id).get();
        return coursRepo.save(cours);
    }
    @Override
    public void deleteCour(Long id) {
        coursRepo.deleteById(id);
    }

    @Override
    public Cours retriveCours(Long numCours) {
        Optional<Cours> optionalCours = coursRepo.findById(numCours);
        if (optionalCours.isPresent()) {
            return optionalCours.get();
        } else {

            throw new RuntimeException("Cours not found for numCours: " + numCours);
        }
    }    }



