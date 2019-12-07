
package lab.pkg8_sergiosuazo;

import javax.swing.JLabel;


public class Timer extends Thread{
    private int minutos, segundos;
    private boolean vive;
    private JLabel hora;

    public Timer() {
    }

    public Timer(JLabel hora) {
        this.hora = hora;
        this.segundos=0;
        this.minutos=0;
        this.vive=true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }
    
    
    @Override
    public void run() 
    {
        try  {
            while (vive) {
                if (segundos == 59) {
                    segundos = 0;
                    minutos++;
                }
                segundos ++;
                hora.setText(minutos+":"+segundos);
                Thread.sleep(1000);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
