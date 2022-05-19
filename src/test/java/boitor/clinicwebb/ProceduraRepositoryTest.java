//package boitor.clinicwebb;
//
//import boitor.clinicwebb.DAO.Procedura;
//import boitor.clinicwebb.Repository.ProceduraRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.annotation.Rollback;
//
//import java.util.Optional;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(false)
//public class ProceduraRepositoryTest {
//    @Autowired private ProceduraRepository repo;
//
//    @Test
//    public void testAddNew(){
//        Procedura procedura = new Procedura();
//        procedura.setAbreviereProceduraAplicabila("CS");
//        procedura.setDescriereProceduraAplcabila("cofimias");
//        procedura.setPretProceduraAplicabila(100);
//
//       Procedura savedProcedura =  repo.save(procedura);
//
//        Assertions.assertThat(savedProcedura).isNotNull();
//        Assertions.assertThat(savedProcedura.getIdProceduraAplicabila()).isGreaterThan(0);
//
//    }
//
//    @Test
//    public void testListAll(){
//        Iterable<Procedura> proceduri = repo.findAll();
//        Assertions.assertThat(proceduri).hasSizeGreaterThan(0);
//
//        for(Procedura procedura : proceduri){
//            System.out.println(procedura);
//        }
//    }
//
//    @Test
//    public void testUpdate(){
//        Integer proceduraId = 3;
//        Optional<Procedura> optionalProcedura = repo.findById(proceduraId);
//        Procedura procedura = optionalProcedura.get();
//        procedura.setPretProceduraAplicabila(800);
//        repo.save(procedura);
//
//        Procedura updateProcedura = repo.findById(proceduraId).get();
//        Assertions.assertThat(updateProcedura.getPretProceduraAplicabila()).isEqualTo(800);
//
//    }
//
//    @Test
//    public void testGet(){
//        Integer proceduraId = 1;
//        Optional<Procedura> optionalProcedura = repo.findById(proceduraId);
//
//
//        Assertions.assertThat(optionalProcedura).isPresent();
//        System.out.println(optionalProcedura.get());
//
//    }
//
//    @Test
//    public void TestDelete(){
//        Integer proceduraId = 3;
//        repo.deleteById(proceduraId);
//
//        Optional<Procedura> optionalProcedura = repo.findById(proceduraId);
//        Assertions.assertThat(optionalProcedura).isNotPresent();
//    }
//
//}
