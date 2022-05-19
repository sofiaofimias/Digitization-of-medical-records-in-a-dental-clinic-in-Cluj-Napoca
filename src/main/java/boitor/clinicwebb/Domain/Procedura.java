package boitor.clinicwebb.Domain;

import javax.persistence.*;

@Entity

@Table(name = "procedura_aplicabila")
//@Data //DEPRECATED getter & setter
public class Procedura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //21.3
    private Integer idProceduraAplicabila;

    @Column(nullable = false) //unique = true
    private String abreviereProceduraAplicabila;

    @Column(nullable = false)
    private String descriereProceduraAplcabila;

    @Column
    private int pretProceduraAplicabila;





    public Integer getIdProceduraAplicabila() {
        return idProceduraAplicabila;
    }

    public void setIdProceduraAplicabila(Integer idProceduraAplicabila) {
        this.idProceduraAplicabila = idProceduraAplicabila;
    }

    public String getAbreviereProceduraAplicabila() {
        return abreviereProceduraAplicabila;
    }

    public void setAbreviereProceduraAplicabila(String abreviereProceduraAplicabila) {
        this.abreviereProceduraAplicabila = abreviereProceduraAplicabila;
    }

    public String getDescriereProceduraAplcabila() {
        return descriereProceduraAplcabila;
    }

    public void setDescriereProceduraAplcabila(String descriereProceduraAplcabila) {
        this.descriereProceduraAplcabila = descriereProceduraAplcabila;
    }

    public int getPretProceduraAplicabila() {
        return pretProceduraAplicabila;
    }

    public void setPretProceduraAplicabila(int pretProceduraAplicabila) {
        this.pretProceduraAplicabila = pretProceduraAplicabila;
    }

    @Override
    public String toString() {
        return "Procedura{" +
                "idProceduraAplicabila=" + idProceduraAplicabila +
                ", abreviereProceduraAplicabila='" + abreviereProceduraAplicabila + '\'' +
                ", descriereProceduraAplcabila='" + descriereProceduraAplcabila + '\'' +
                ", pretProceduraAplicabila=" + pretProceduraAplicabila +
                '}';
    }
}
