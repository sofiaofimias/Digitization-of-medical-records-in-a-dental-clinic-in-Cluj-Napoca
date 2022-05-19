package boitor.clinicwebb.Controller;

import boitor.clinicwebb.Domain.PrescriptieMedicala;
import boitor.clinicwebb.Repository.PrescriptieMedicalaRepository;
import boitor.clinicwebb.Service.PrescriptieMedicalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class PrescriptieMedicalaController {
    @Autowired
    private PrescriptieMedicalaRepository repo;

    @Autowired
    PrescriptieMedicalaService service;

    @GetMapping("/prescriptieMedicala")
    public String showPrescriptieList(Model model){

        List<PrescriptieMedicala> listPrescriptieMedicala = repo.findAll();
        model.addAttribute("listPrescriptieMedicala", listPrescriptieMedicala);

        return "prescriptieMedicala";
    }

    @GetMapping("/prescriptieMedicala/new")
    public String showNewForm(Model model){
        model.addAttribute("prescriptieMedicala", new PrescriptieMedicala());
        model.addAttribute("pageTitle", "adauga noua prescriptie");
        return "prescriptie_medicala_form";
    }

    @PostMapping("/prescriptieMedicala/save")
    public String savePrescriptie(PrescriptieMedicala prescriptieMedicala, RedirectAttributes ra){
        service.save(prescriptieMedicala);
        ra.addFlashAttribute("message", "adaugat!!");
        return "redirect:/prescriptieMedicala";
    }

    @GetMapping("/prescriptieMedicala/edit/{idPrescriptie}")
    public String showEditForm(@PathVariable("idPrescriptie") Integer idPrescriptie, Model model, RedirectAttributes ra ){
//        try {
            PrescriptieMedicala prescriptieMedicala = service.get(idPrescriptie);
            model.addAttribute("prescriptieMedicala", prescriptieMedicala);
            model.addAttribute("pageTitle", "Edit prescriptie (ID:" + idPrescriptie + ")");
            return "prescriptie_medicala_form";
//        } catch (ProceduraNotFoundException e) {
//            ra.addFlashAttribute("message", e.getMessage());
//            return "redirect:/proceduri";
//        }
    }

    @GetMapping("/prescriptieMedicala/delete/{idPrescriptie}")
    public String deleteprescriptieMedicala(@PathVariable("idPrescriptie") Integer idPrescriptie, RedirectAttributes ra ){
//        try {
            service.delete(idPrescriptie);


//        } catch (ProceduraNotFoundException e) {
//            ra.addFlashAttribute("message", e.getMessage());
//
//        }

        return "redirect:/prescriptieMedicala";
    }

}
