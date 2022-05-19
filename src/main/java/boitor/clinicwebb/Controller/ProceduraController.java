package boitor.clinicwebb.Controller;

import boitor.clinicwebb.Domain.Procedura;
import boitor.clinicwebb.Repository.ProceduraRepository;
import boitor.clinicwebb.Service.ProceduraNotFoundException;
import boitor.clinicwebb.Service.ProceduraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProceduraController {
    @Autowired private ProceduraService service;
    @Autowired private ProceduraRepository repo;

    @GetMapping("/proceduri")
    public String showProceduraList(Model model){
        //List<Procedura> listProceduri = service.listAll();
        List<Procedura> listProceduri = repo.findAll();
        model.addAttribute("listProceduri", listProceduri);


        return "proceduri";
    }

    @GetMapping("/proceduri/new")
    public String showNewForm(Model model){
        model.addAttribute("procedura", new Procedura());
        model.addAttribute("pageTitle", "adauga noua procedura");
        return "procedura_form";
    }


    @PostMapping("/proceduri/save")
    public String saveProcedura(Procedura procedura, RedirectAttributes ra){
        service.save(procedura);
        ra.addFlashAttribute("message", "adaugat!!");
        return "redirect:/proceduri";
    }

    @GetMapping("/proceduri/edit/{idProceduraAplicabila}")
    public String showEditForm(@PathVariable("idProceduraAplicabila") Integer idProceduraAplicabila, Model model, RedirectAttributes ra ){
        try {
            Procedura procedura = service.get(idProceduraAplicabila);
            model.addAttribute("procedura", procedura);
            model.addAttribute("pageTitle", "Edit user (ID:" + idProceduraAplicabila + ")");
            return "procedura_form";
        } catch (ProceduraNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/proceduri";
        }
    }

    @GetMapping("/proceduri/delete/{idProceduraAplicabila}")
    public String deleteProcedura(@PathVariable("idProceduraAplicabila") Integer idProceduraAplicabila, RedirectAttributes ra ){
        try {
            service.delete(idProceduraAplicabila);


        } catch (ProceduraNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());

        }

        return "redirect:/proceduri";
    }




}
