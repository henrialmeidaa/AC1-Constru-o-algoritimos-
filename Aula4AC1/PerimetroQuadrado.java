import java.util.Scanner;

public class PerimetroQuadrado {

    public static void main (String[] args) {
//informa o que o programa faz 
System.out.println ("Calculo do perimetro de um quadrado");

//solicita o numero da base do retangulo
Scanner scanner = new Scanner(System.in);
System.out.println("digite o numero do lado do quadrado:");
int Numerolado = scanner.nextInt ();

//calcula o perimetro do quadrado
int ResultadoPerimetro = 4 * Numerolado;

// exibe o resultado
System.out.println("O perimetro é:" + ResultadoPerimetro);

scanner.close();
    }
}