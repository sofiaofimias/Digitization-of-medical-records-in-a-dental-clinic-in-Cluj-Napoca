package boitor.clinicwebb.Service;


import boitor.clinicwebb.Domain.PrescriptieMedicala;
import boitor.clinicwebb.Repository.PrescriptieMedicalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrescriptieMedicalaService {
    @Autowired
    PrescriptieMedicalaRepository repo;

    public List<PrescriptieMedicala> listAll(){
        return (List<PrescriptieMedicala>) repo.findAll();
    }

    public void save(PrescriptieMedicala prescriptieMedicala) {
        repo.save(prescriptieMedicala);
    }

    public PrescriptieMedicala get(Integer idPrescriptie) {
        Optional<PrescriptieMedicala> result = repo.findById(idPrescriptie);
        return result.get();
    }

    public void delete(Integer idPrescriptie){
        repo.deleteById(idPrescriptie);
    }
}
