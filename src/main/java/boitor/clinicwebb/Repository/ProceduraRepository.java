package boitor.clinicwebb.Repository;

import boitor.clinicwebb.Domain.Procedura;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository //anotatia care creaza un BEAN de repository cu numele ProceduraRepository
public interface ProceduraRepository extends JpaRepository<Procedura, Integer> {
    //public Long countById(Integer idProceduraAplicabila);
}
