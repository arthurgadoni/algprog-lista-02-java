import java.util.Scanner;

public class algot_04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = entrada.nextDouble();

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = entrada.nextDouble();

        double total = precoLitro * litros;

        System.out.println("O cliente deverá pagar: R$ " + total);

        entrada.close();
    }
}