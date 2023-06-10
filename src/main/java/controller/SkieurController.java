package controller;

import com.example.firststep.entites.Skieur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Skieur")
public class SkieurController {

    @Autowired
    private SkieurController skieurService;
    @PutMapping("/assignSkieurToPiste/{numSkieur}/{numPiste}")
    public void assignSkieurToPiste(@PathVariable("numSkieur")Long numSkieur, @PathVariable("numPiste") Long numPiste) {
        skieurService.assignSkieurToPiste( numSkieur, numPiste);
    }
    @PostMapping("/addSkieur")
    public void addSkieur(@RequestBody Skieur skieur) {
        skieurService.addSkieur(skieur);
    }
    @PutMapping("/updateSkieur/{id}")
    public void updateSkieur(@PathVariable("id")Long id,@RequestBody Skieur skieur) {
        skieurService.updateSkieur(id);
    }
    @PostMapping("/deleteSkieur/{id}")
    public void deleteSkieur(@PathVariable("id") Long id) {
        skieurService.deleteSkieur(id);
    }


    @GetMapping("/skieurr/{id}")

    public Skieur getSkieurbyId(@PathVariable("id") Long id){
        return skieurService.getSkieurbyId(id);
    }
}