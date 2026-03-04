import java.util.Random;
public class Prueba {
    public static void seleccion(int[] n) {
        for (int i=0; i<n.length-1; i++){
            int m = i;
            for (int j=i+1; j<n.length; j++) {
                if (n[j]<n[m]) {
                    m = j;
                }
            }
            int t=n[i];
            n[i]=n[m];
            n[m]=t;
        }
    }
    public static void main(String[] args) {
        int[] num = new int[100000];
        Random r = new Random();

        for (int i=0; i<num.length; i++) {
            num[i] = r.nextInt(100000);
        }
        Cronometro c = new Cronometro();
        c.iniciar();
        seleccion(num);
        c.detener();
        System.out.println("Tiempo: " + c.lapsoDeTiempo() + " milisegundos");
    }
}