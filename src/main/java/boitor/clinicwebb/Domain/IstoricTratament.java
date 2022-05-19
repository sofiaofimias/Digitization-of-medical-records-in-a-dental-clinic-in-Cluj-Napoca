package boitor.clinicwebb.Domain;

import javax.persistence.*;

@Entity

@Table(name = "istoric_tratament")


public class IstoricTratament {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idIstoric;




}
