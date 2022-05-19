package boitor.clinicwebb.Controller;


import boitor.clinicwebb.Domain.Procedura;
import boitor.clinicwebb.Domain.ProceduraAplicata;
import boitor.clinicwebb.Repository.ProceduraAplicataRepository;
import boitor.clinicwebb.Repository.ProceduraRepository;
import boitor.clinicwebb.Service.ProceduraAplicataNotFoundException;
import boitor.clinicwebb.Service.ProceduraAplicataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProceduraAplicataController {
    @Autowired
    private ProceduraAplicataService service;

    @Autowired
    private ProceduraAplicataRepository procAplRepo;

    @Autowired
    private ProceduraRepository procRepo;



    @GetMapping("/proceduraAplicata")
    public String showProceduraAplicataList(Model model){
        List<ProceduraAplicata> listProceduraAplicata = service.listAll();
        model.addAttribute("listProceduraAplicata", listProceduraAplicata);

        return "proceduraAplicata";
    }

    @GetMapping("/proceduraAplicata/new")
    public String showNewForm(Model model){

        List<Procedura> listProceduri = procRepo.findAll();

        model.addAttribute("proceduraAplicata", new ProceduraAplicata());
        model.addAttribute("pageTitle", "adauga o procedura aplicata");
        model.addAttribute("listProceduri", listProceduri);


        return "procedura_aplicata_form";
    }

    @PostMapping("/proceduraAplicata/save")
    public String saveProceduraAplicata(ProceduraAplicata proceduraAplicata, RedirectAttributes ra ){
        service.save(proceduraAplicata);
        ra.addFlashAttribute("message", "procedura aplicata adaugata");
        return "redirect:/proceduraAplicata";
    }

    @GetMapping("/proceduraAplicata/edit/{idProceduraAplicata}")
    public String showEditForm(@PathVariable("idProceduraAplicata") Integer idProceduraAplicata, Model model, RedirectAttributes ra  ){
       try {
           List<Procedura> listProceduri = procRepo.findAll();

           ProceduraAplicata proceduraAplicata = service.get(idProceduraAplicata);
           model.addAttribute("proceduraAplicata", proceduraAplicata);
           model.addAttribute("pageTitle", "Edit procedura cu ID: " + idProceduraAplicata);
           model.addAttribute("listProceduri", listProceduri);

           return "procedura_aplicata_form";
       }
       catch(ProceduraAplicataNotFoundException e){
           ra.addFlashAttribute("message", e.getMessage());
           return "redirect:/proceduraAplicata";
       }
    }

    @GetMapping("/proceduraAplicata/delete/{idProceduraAplicata}")
    public String deleteProceduraAplicata(@PathVariable("idProceduraAplicata") Integer idProceduraAplicata, RedirectAttributes ra  ){
        try {
            service.delete(idProceduraAplicata);


        } catch (ProceduraAplicataNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());

        }

        return "redirect:/proceduraAplicata";
    }
    }






