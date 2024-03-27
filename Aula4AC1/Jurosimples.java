import java.util.Scanner;

public class Jurosimples {

    public static void main (String[] args) {
//informa o que o programa faz 
System.out.println ("Calculo de juros simples");

//solicita o valor do dinheiro
Scanner scanner = new Scanner(System.in);
System.out.println("digite o valor do dinheiro:");
int valordinheiro = scanner.nextInt ();

//digite a taxa de juros
System.out.println ("digite o numero da taxa de juros: ");
int taxajuros = scanner.nextInt();

System.out.println ("digite o numero de tempo: ");
int tempojuros = scanner.nextInt();

//calculando juros 
int resultadojuros = valordinheiro * taxajuros * tempojuros;

//exibe o resultado
System.out.println( "O juros é: " + resultadojuros);
scanner.close();
    }
}