import java.util.Scanner;

public class AreaQuadrado {

    public static void main (String[] args) {
//informa o que o programa faz 
System.out.println ("Calculo da area de um quadrado");

//solicita o numemero do lado do quadrado
Scanner scanner = new Scanner(System.in);
System.out.println("digite o numero do lado do quadrado:");
int NumeroLado = scanner.nextInt ();

//calcula a area do quadrado
int resultadoarea = 2 * NumeroLado;

// exibe o resultado
System.out.println("A area do quadrado é:" + resultadoarea);
scanner.close();
    }
}