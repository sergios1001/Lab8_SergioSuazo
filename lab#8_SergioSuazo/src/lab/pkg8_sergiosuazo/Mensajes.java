
package lab.pkg8_sergiosuazo;

import java.util.Date;

public class Mensajes {
    private String emisor,receptor,mensaje;
    private Date fecha;

    public Mensajes() {
    }

    public Mensajes(String emisor, String receptor, String mensaje, Date fecha) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.mensaje = mensaje;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return mensaje ;
    }
    
}
