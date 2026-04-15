package Exercicio4;

/**
 *
 * @author Cliente
 */
public class Relogio {
    private int horas, minutos;
    
    public Relogio(int h, int m){
        if((h >= 0 && h < 24) && (m >= 0 && m < 60)){
            horas = h;
            minutos = m;
        } else {
            horas = 0;
            minutos = m;
            System.out.println("Horario invalido. Inicializando com 00:00");
        }
    }
    
    public void atualizaVisor(){
        System.out.printf("Horario: %02d:%02d\n", horas, minutos);
    }
    
    public void eventoDoRelogio(){
        minutos++;
        if(minutos == 60){
            minutos = 0;
            if(horas == 23){
                horas = 0;
            } else {
                horas++;
            }
        }
    }
}
