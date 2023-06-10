package Reposities;

import com.example.firststep.entites.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MoniteurRepository extends JpaRepository<Cours,Long> {
}
