package boitor.clinicwebb.Domain;


import javax.persistence.*;

@Entity
@Table(name = "role")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;

    @Column
    private String numeRol;

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNumeRol() {
        return numeRol;
    }

    public void setNumeRol(String numeRol) {
        this.numeRol = numeRol;
    }
}
