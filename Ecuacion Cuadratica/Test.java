import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese a, b, c: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        
        EcuacionCuadratica ecuacion;
        ecuacion = new EcuacionCuadratica(a, b, c);

        double discriminante = ecuacion.getDiscriminante();

        if (discriminante > 0) {
            System.out.println("La ecuacion tiene dos raices "+ ecuacion.getRaiz1() + " y "+ ecuacion.getRaiz2());
        }
        else if (discriminante == 0) {
            System.out.println("La ecuacion tiene una raiz "+ ecuacion.getRaiz1());
        }
        else {
            System.out.println("La ecuacion no tiene raices reales");
        }
        entrada.close();
    }
}
