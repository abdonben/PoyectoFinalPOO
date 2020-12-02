package aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Registro {
    private Date hora;

    private Date dia;

    private String patente;

    private List<Calle> calle = new ArrayList<Calle> ();


    public Registro(Date hora, Date dia, String patente, List<Calle> calle) {
        this.hora = hora;
        this.dia = dia;
        this.patente = patente;
        this.calle = calle;
    }


    
    public void registrarEstacionamiento() {
    }



    Date getDia() {
        return this.dia;
    }

    void setDia(Date value) {
        this.dia = value;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public List<Calle> getCalle() {
        return calle;
    }

    public void setCalle(List<Calle> calle) {
        this.calle = calle;
    }

 
}
