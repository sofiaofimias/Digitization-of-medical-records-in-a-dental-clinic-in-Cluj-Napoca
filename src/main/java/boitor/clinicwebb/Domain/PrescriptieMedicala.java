package boitor.clinicwebb.Domain;

import javax.persistence.*;

@Entity

@Table(name="prescriptie_medicala")

public class PrescriptieMedicala {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPrescriptie;

    @Column
    private String dataPrescriptie;

    @Column
    private String continutPrescriptie;

    @Column
    private String obsPrescriptie;


    public Integer getIdPrescriptie() {
        return idPrescriptie;
    }

    public void setIdPrescriptie(Integer idPrescriptie) {
        this.idPrescriptie = idPrescriptie;
    }

    public String getDataPrescriptie() {
        return dataPrescriptie;
    }

    public void setDataPrescriptie(String dataPrescriptie) {
        this.dataPrescriptie = dataPrescriptie;
    }

    public String getContinutPrescriptie() {
        return continutPrescriptie;
    }

    public void setContinutPrescriptie(String continutPrescriptie) {
        this.continutPrescriptie = continutPrescriptie;
    }

    public String getObsPrescriptie() {
        return obsPrescriptie;
    }

    public void setObsPrescriptie(String obsPrescriptie) {
        this.obsPrescriptie = obsPrescriptie;
    }
}
