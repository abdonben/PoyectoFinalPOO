package aplicacion.modelo.dominio;

import java.util.Date;

public class Calle implements AplicacionWEB {
    private boolean lugarDisponible;

    public void cobroEstacionamiento() {
    }

    boolean isLugarDisponible() {
        return this.lugarDisponible;
    }

    void setLugarDisponible(boolean value) {
        this.lugarDisponible = value;
    }

    @Override
    public void cobroEstacionamiento(Calle calle, String patente, Date dia, Date hora) {
        // TODO Auto-generated method stub

    }

}
