package Exercicio4;

/**
 *
 * @author Cliente
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Relogio rel = new Relogio(23, 49);
        
        for(int i = 0; i < 30; i++){
            rel.eventoDoRelogio();
            rel.atualizaVisor();
        }
    }
    
}
