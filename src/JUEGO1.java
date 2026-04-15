import java.util.Scanner;
public class JUEGO1 {
    public int numeroDeVidas; 
    public int record;
 
    public JUEGO1(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida(){
        System.out.println("Partida reiniciada");
    }
    public void actualizaRecord(int nuevo_record){
        record++;
        System.out.println("El nuevo record es: " + record );
    }
    public boolean  quitaVida(){
    numeroDeVidas--;
        System.out.println("Le quedan " + numeroDeVidas +" vidas.");
    return numeroDeVidas>0;
    }
 }


class  JuegoAdivinaNumero extends JUEGO1 {
    public int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public void juega(){
        reiniciaPartida();
        numeroAAdivinar=(int) (Math.random() * 11);
        System.out.println("Adivine un numero entre el 0 y el 10");
        
        while (numeroDeVidas>0) {
        Scanner n =new Scanner(System.in);
        int numero= n.nextInt();
      
        if(  numeroAAdivinar ==numero){
            System.out.println("Acertaste!! ");
            actualizaRecord(record);
            return;
            
        } else{
            quitaVida();
            if ( numeroAAdivinar>numero){
                System.out.println("El numero a adivinar es mayor");  
            }else{
                System.out.println("El numero a adivinar es menor");
            }
        }
    }
 }
    public boolean   validaNumero(int n){
       return n >= 0 && n <= 10;
        
        
    }
}


class JuegoAdivinaPar extends JuegoAdivinaNumero{

    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
     public boolean   validaNumero(int n){
       if( n%2==0&& n >= 0 && n <= 10 ){
           return true;
    }else{  System.out.println("Error");
            return false; }
        
       }
}
class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
     public boolean   validaNumero(int n){
       if( n%2!=0&& n >= 0 && n <= 10 ){
           return true;
    }else{  System.out.println("Error");
            return false; }
        
    }
}
