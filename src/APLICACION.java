
public class APLICACION {

    public static void main(String[] args) {
       JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println("--- Juego Normal ---");
        juego1.juega();

        System.out.println("--- Juego Números Pares ---");
        juego2.validaNumero(4);
        

        System.out.println("--- Juego Números Impares ---");
        juego3.validaNumero(8);
        
    }
    
}

