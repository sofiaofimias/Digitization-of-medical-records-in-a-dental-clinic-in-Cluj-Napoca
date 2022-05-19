package boitor.clinicwebb.Domain;


import javax.persistence.Entity;
import javax.persistence.*;

@Entity

@Table(name="plan_tratament")

public class PlanTratament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPlanTratament;

    @Column
    private String obsProcedura;

    @ManyToOne
    @JoinColumn(name = "id_procedura_aplicabila")
    private Procedura procedura;

    @ManyToOne
    @JoinColumn(name = "id_dinte")
    private Dinte dinte;

    public Integer getIdPlanTratament() {
        return idPlanTratament;
    }

    public void setIdPlanTratament(Integer idPlanTratament) {
        this.idPlanTratament = idPlanTratament;
    }

    public String getObsProcedura() {
        return obsProcedura;
    }

    public void setObsProcedura(String obsProcedura) {
        this.obsProcedura = obsProcedura;
    }

    public Procedura getProcedura() {
        return procedura;
    }

    public void setProcedura(Procedura procedura) {
        this.procedura = procedura;
    }

    public Dinte getDinte() {
        return dinte;
    }

    public void setDinte(Dinte dinte) {
        this.dinte = dinte;
    }
}
