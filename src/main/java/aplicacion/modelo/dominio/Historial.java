package aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Historial {
    private Date fecha;

    private List<Registro> registro = new ArrayList<Registro> ();

    public Historial(Date fecha, List<Registro> registro) {
        this.fecha = fecha;
        this.registro = registro;
    }

    
    public void recaudacionDia(Calle calle, Date fecha) {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Registro> getRegistro() {
        return registro;
    }

    public void setRegistro(List<Registro> registro) {
        this.registro = registro;
    }


}
