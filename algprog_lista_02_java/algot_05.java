import java.util.Scanner;

public class algot_05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço da viagem para a Alemanha: ");
        double precoAlemanha = entrada.nextDouble();

        System.out.print("Digite a quantidade de pessoas para a Alemanha: ");
        int pessoasAlemanha = entrada.nextInt();

        System.out.print("Digite o preço da viagem para Portugal: ");
        double precoPortugal = entrada.nextDouble();

        System.out.print("Digite a quantidade de pessoas para Portugal: ");
        int pessoasPortugal = entrada.nextInt();

        System.out.print("Digite o preço da viagem para a Itália: ");
        double precoItalia = entrada.nextDouble();

        System.out.print("Digite a quantidade de pessoas para a Itália: ");
        int pessoasItalia = entrada.nextInt();

        double totalAlemanha = precoAlemanha * pessoasAlemanha;
        double totalPortugal = precoPortugal * pessoasPortugal;
        double totalItalia = precoItalia * pessoasItalia;

        double totalViagem = totalAlemanha + totalPortugal + totalItalia;

        int totalPessoas = pessoasAlemanha + pessoasPortugal + pessoasItalia;

        System.out.println("Total de pessoas: " + totalPessoas);
        System.out.println("Valor total da viagem: R$ " + totalViagem);

        entrada.close();
    }
}
