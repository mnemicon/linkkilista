package harjoitus.linkkilista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LinkkilistaController {

    @Autowired
    private LinkkiRepository linkkiRepository;
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/links")
    public String list(Model model) {
        model.addAttribute("linkit", this.linkkiRepository.findAll());  //TÄMÄ MULTA PUUTTUI.
        return "links";
    }
    
    @GetMapping("/newlink")
    public String show() {
        return "newlink";
    }
    @PostMapping("/newlink")
    public String create(@RequestParam String osoite, @RequestParam String kuvaus, @RequestParam String hakusana, @RequestParam String tyyppi) {
/*        Linkki linkki = new Linkki(osoite, kuvaus);*/
        this.linkkiRepository.save(new Linkki(osoite, kuvaus, hakusana, tyyppi));
        return "redirect:/newlink";
    }
}