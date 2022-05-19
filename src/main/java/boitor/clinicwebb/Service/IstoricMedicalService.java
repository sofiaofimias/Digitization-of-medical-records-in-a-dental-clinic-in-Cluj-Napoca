package boitor.clinicwebb.Service;


import boitor.clinicwebb.Domain.IstoricMedical;
import boitor.clinicwebb.Repository.IstoricMedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IstoricMedicalService {
    @Autowired private IstoricMedicalRepository repo;

    public List<IstoricMedical> listAll(){
        return (List<IstoricMedical>) repo.findAll();
    }

    public void save(IstoricMedical istoricMedical) {
        repo.save(istoricMedical);
    }

    public IstoricMedical get(Integer idIstoricMedical) throws IstoricMedicalNotFoundException {
        Optional<IstoricMedical> result = repo.findById(idIstoricMedical);
        if (result.isPresent()){
            return result.get();
        }
        throw new IstoricMedicalNotFoundException("Nu am gasit istoric medical cu id " + idIstoricMedical);
    }


    public void delete(Integer idIstoricMedical) throws IstoricMedicalNotFoundException {
//       Long count = repo.countById(idProceduraAplicabila);
//       if(count == null || count == 0){
//           throw new ProceduraNotFoundException("nu am gasit idul" + idProceduraAplicabila);
//       }
        repo.deleteById(idIstoricMedical);
    }


}
