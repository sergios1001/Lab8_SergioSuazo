
package lab.pkg8_sergiosuazo;

import java.util.Date;

public class Llamada {
    private String emisor, receptor, duracion;
    private Date fecha;

    public Llamada() {
    }

    public Llamada(String emisor, String receptor, String duracion, Date fecha) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Llamada{" + "emisor=" + emisor + ", receptor=" + receptor + ", duracion=" + duracion + ", fecha=" + fecha + '}';
    }
    
    
}
