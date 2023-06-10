package Reposities;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.firststep.entites.Cours;

@Repository

public interface CoursRepository extends JpaRepository<Cours,Long>  {
}
