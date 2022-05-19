package boitor.clinicwebb.Domain;

import javax.persistence.*;

@Entity

@Table(name = "procedura_aplicata")


public class ProceduraAplicata {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //21.3
    private Integer idProceduraAplicata;

    @Column
    private String dataProceduraAplicata;

    @Column
    private Integer pretFinal;

    @Column
    private String obsProcedura;

    @ManyToOne
    @JoinColumn(name = "id_procedura_aplicabila")
    private Procedura procedura;

    @ManyToOne
    @JoinColumn(name = "id_dinte")
    private Dinte dinte;



    public Integer getIdProceduraAplicata() {
        return idProceduraAplicata;
    }

    public void setIdProceduraAplicata(Integer idProceduraAplicata) {
        this.idProceduraAplicata = idProceduraAplicata;
    }

    public String getDataProceduraAplicata() {
        return dataProceduraAplicata;
    }

    public void setDataProceduraAplicata(String dataProceduraAplicata) {
        this.dataProceduraAplicata = dataProceduraAplicata;
    }

    public Integer getPretFinal() {
        return pretFinal;
    }

    public void setPretFinal(Integer pretFinal) {
        this.pretFinal = pretFinal;
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
