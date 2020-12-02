package aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Cuadra implements AplicacionWEB {
    private String nombre;

    private int cantidadLugar;

    private List<Calle> calle = new ArrayList<Calle> ();

    public Cuadra(String nombre, int cantidadLugar, List<Calle> calle) {
        this.nombre = nombre;
        this.cantidadLugar = cantidadLugar;
        this.calle = calle;
    }
    

    public void cobroEstacionamiento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadLugar() {
        return cantidadLugar;
    }

    public void setCantidadLugar(int cantidadLugar) {
        this.cantidadLugar = cantidadLugar;
    }

    public List<Calle> getCalle() {
        return calle;
    }

    public void setCalle(List<Calle> calle) {
        this.calle = calle;
    }



}
