import java.util.Scanner;

public class Celsiusfahrenheit {

    public static void main (String[] args) {
//informa o que o programa faz 
System.out.println ("este programa realiza a conversao de celsius para fahrenheeit");

//solicita a temperatura em celsius
Scanner scanner = new Scanner(System.in);
System.out.println("digite a temperatura em celsius:");
int temperaturacelsius = scanner.nextInt ();

//calcula a conversão
int temperaturafahrenheit = temperaturacelsius * 9/5 +32;

// exibe o resultado
System.out.println("a temperatura em fahrenheeit é:" + temperaturafahrenheit);
scanner.close();
    }
}