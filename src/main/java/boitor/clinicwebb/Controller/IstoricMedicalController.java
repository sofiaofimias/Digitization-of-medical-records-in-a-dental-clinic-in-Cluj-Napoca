package boitor.clinicwebb.Controller;

import boitor.clinicwebb.Domain.IstoricMedical;
import boitor.clinicwebb.Repository.IstoricMedicalRepository;
import boitor.clinicwebb.Service.IstoricMedicalNotFoundException;
import boitor.clinicwebb.Service.IstoricMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class IstoricMedicalController {
    @Autowired
    IstoricMedicalService service;

    @Autowired
    IstoricMedicalRepository repo;

    @GetMapping("/istoricMedical")
    public String showIstoricMedicalList(Model model){
        List<IstoricMedical> listIstoricMedical = service.listAll();
        model.addAttribute("listIstoricMedical", listIstoricMedical);
        return "istoricMedical";
    }

    @GetMapping("istoricMedical/new")
    public String showNewForm(Model model){
        model.addAttribute("istoricMedical", new IstoricMedical());
        model.addAttribute("page Title", "adauga istoric medical");
        return "istoric_medical_form";
    }

    @PostMapping("/istoricMedical/save")
    public String saveIstoricMedical(IstoricMedical istoricMedical, RedirectAttributes ra){
        service.save(istoricMedical);
        ra.addFlashAttribute("message", "adaugat!!");
        return "redirect:/istoricMedical";
    }

    @GetMapping("/istoricMedical/edit/{idIstoricMedical}")
    public String showEditForm(@PathVariable("idIstoricMedical") Integer idIstoricMedical, Model model, RedirectAttributes ra ){
        try {
            IstoricMedical istoricMedical = service.get(idIstoricMedical);
            model.addAttribute("istoricMedical", istoricMedical);
            model.addAttribute("pageTitle", "Edit istoric medical (ID:" + idIstoricMedical + ")");
            return "istoric_medical_form";
        } catch (IstoricMedicalNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/istoricMedical";
        }
    }

    @GetMapping("/istoricMedical/delete/{idIstoricMedical}")
    public String deleteProcedura(@PathVariable("idIstoricMedical") Integer idIstoricMedical, RedirectAttributes ra ){
        try {
            service.delete(idIstoricMedical);


        } catch (IstoricMedicalNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());

        }

        return "redirect:/istoricMedical";
    }

}
