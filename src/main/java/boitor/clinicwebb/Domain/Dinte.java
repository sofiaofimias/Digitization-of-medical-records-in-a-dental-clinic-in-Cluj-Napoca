package boitor.clinicwebb.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "dinte")

public class Dinte {

    @Id
    @Column(nullable = false)
    private int idDinte;

    @Column(nullable = false)
    private String zonaDinte;

    @Column
    private String numeDinte;


    public int getIdDinte() {
        return idDinte;
    }

    public void setIdDinte(int idDinte) {
        this.idDinte = idDinte;
    }

    public String getZonaDinte() {
        return zonaDinte;
    }

    public void setZonaDinte(String zonaDinte) {
        this.zonaDinte = zonaDinte;
    }

    public String getNumeDinte() {
        return numeDinte;
    }

    public void setNumeDinte(String numeDinte) {
        this.numeDinte = numeDinte;
    }
}
