package boitor.clinicwebb.Controller;

import boitor.clinicwebb.Domain.User;
import boitor.clinicwebb.Repository.ProceduraRepository;
import boitor.clinicwebb.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    //@Autowired // asta iti initializeaza elementul anotat automat cu elementul deja existent in cod
    //@Lazy // asta face ca anotatia anterioara sa intarzie pana sa fie folosit elementul anotat
//    ProceduraRepository proceduraRepository;






    @GetMapping("/show")
    public String showHomePage(){
        return "index";
    }




}
