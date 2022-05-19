package boitor.clinicwebb.Service;


import boitor.clinicwebb.Domain.ProceduraAplicata;
import boitor.clinicwebb.Repository.ProceduraAplicataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service


public class ProceduraAplicataService {
    @Autowired private ProceduraAplicataRepository repo;

    public List<ProceduraAplicata> listAll(){
        return (List<ProceduraAplicata>) repo.findAll();
    }

    public void save(ProceduraAplicata proceduraAplicata) {
        repo.save(proceduraAplicata);
    }

    public ProceduraAplicata get(Integer idProceduraAplicata) throws ProceduraAplicataNotFoundException{
        Optional<ProceduraAplicata> result = repo.findById(idProceduraAplicata);
        if (result.isPresent()) {
            return result.get();
        }
        throw new ProceduraAplicataNotFoundException("Nu am gasit procedura cu id" + idProceduraAplicata);
    }

    public void delete(Integer idProceduraAplicata) throws ProceduraAplicataNotFoundException{
        repo.deleteById(idProceduraAplicata);
    }

}
