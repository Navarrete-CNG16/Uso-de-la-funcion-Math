package raices.ecuaciones.de.segundo.grado;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class RaicesEcuacionesDeSegundoGrado {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x1,x2,a,b,c;
        a = 1;
        System.out.println("Dame el valor de b: ");
        b = S.nextInt();
        System.out.println("Dame el valor de c: ");
        c = S.nextInt();
        x1 = (int) (-b/2 + sqrt(Math.pow(b,2)/4-c));
        x2 = (int) (-b/2 - sqrt(Math.pow(b,2)/4-c));
        System.out.println("Raiz de x1 es: "+x1);
        System.out.println("Raiz de x2 es: "+x2);
    }
}
