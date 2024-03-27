import java.util.Scanner;

public class PerimetroRetangulo {

    public static void main (String[] args) {
//informa o que o programa faz 
System.out.println ("Calculo do perimetro de um retangulo");

//solicita o numero da base do retangulo
Scanner scanner = new Scanner(System.in);
System.out.println("digite o numero da base do retangulo:");
int NumeroBase = scanner.nextInt ();

//solicita o numero da altura do retangulo
System.out.println("digite o numero da altura do retangulo:");

int NumeroAltura = scanner.nextInt();

//calcula o perimetro
int ResultadoPerimetro = 2 * (NumeroBase + NumeroAltura);

// exibe o resultado
System.out.println("O perimetro é:" + ResultadoPerimetro);

scanner.close();
    }
}