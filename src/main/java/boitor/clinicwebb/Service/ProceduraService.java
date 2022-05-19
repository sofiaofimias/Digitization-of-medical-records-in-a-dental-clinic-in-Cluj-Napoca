package boitor.clinicwebb.Service;

import boitor.clinicwebb.Domain.Procedura;
import boitor.clinicwebb.Repository.ProceduraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProceduraService {
    @Autowired private ProceduraRepository repo;

    public List<Procedura> listAll(){
        return (List<Procedura>) repo.findAll();



    }

    public void save(Procedura procedura) {
        repo.save(procedura);
    }


    public Procedura get(Integer idProceduraAplicabila) throws ProceduraNotFoundException {
        Optional<Procedura> result = repo.findById(idProceduraAplicabila);
        if (result.isPresent()){
            return result.get();
        }
        throw new ProceduraNotFoundException("Nu am gasit procedura cu id " + idProceduraAplicabila);
    }

    public void delete(Integer idProceduraAplicabila) throws ProceduraNotFoundException {
//       Long count = repo.countById(idProceduraAplicabila);
//       if(count == null || count == 0){
//           throw new ProceduraNotFoundException("nu am gasit idul" + idProceduraAplicabila);
//       }
       repo.deleteById(idProceduraAplicabila);
    }
}
