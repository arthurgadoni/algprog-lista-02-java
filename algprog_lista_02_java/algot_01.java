import java.util.Scanner;

public class algot_01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Salve mano, fala um numero pra mim ai: ");
        double numero = entrada.nextDouble();

        System.out.println("O numero que você disse foi " + numero);

        entrada.close();
    }
}