package boitor.clinicwebb.Domain;


import javax.persistence.*;

@Entity

@Table(name = "istoric_medical")

public class IstoricMedical {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idIstoricMedical;



    @Column
    private String sarcina;

    @Column
    private String diagnostic;

    @Column
    private String alergie;

    public Integer getIdIstoricMedical() {
        return idIstoricMedical;
    }

    public void setIdIstoricMedical(Integer idIstoricMedical) {
        this.idIstoricMedical = idIstoricMedical;
    }



    public String getSarcina() {
        return sarcina;
    }

    public void setSarcina(String sarcina) {
        this.sarcina = sarcina;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getAlergie() {
        return alergie;
    }

    public void setAlergie(String alergie) {
        this.alergie = alergie;
    }
}
