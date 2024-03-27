import java.util.Scanner;
import java.lang. Math;
public class RaizCubica {

    public static void main (String[] args) {
//informa o que o programa faz 
System.out.println ("Calculo da raiz cubica");

//solicita o numero ao usuario
Scanner scanner = new Scanner(System.in);
System.out.println("digite o numero:");
double numero = scanner.nextDouble();

//calcula a raiz do numero
double resultadoNumero = Math.cbrt(numero);

//exibe o resultado 
System.out.println("a raiz cubica é " + resultadoNumero);
scanner.close();
    }
}