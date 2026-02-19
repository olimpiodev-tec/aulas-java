import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Calculadora de prestação de Veículo \n");

        System.out.println("Qual modelo do veículo?");
        String veiculo = entrada.nextLine();

        System.out.println("Qual valor do veículo?");
        double valorTotal = entrada.nextDouble();

        System.out.println("Em quantas parcelas você deseja pagar?");
        int qtdeParcelas = entrada.nextInt();

        double taxa = 2.45;
        double valorEntrada = valorTotal * 0.30;
        double valorParcelado = valorTotal - valorEntrada;
        double totalTaxa = taxa * qtdeParcelas;
        double totalAcrescimo = valorParcelado * (totalTaxa / 100);
        double valorTotalParceladoComAcrescimo = totalAcrescimo + valorParcelado;
        double valorParcela = valorTotalParceladoComAcrescimo / qtdeParcelas;

        System.out.println("Relatório para veículo " + veiculo);
        System.out.println("Entrada: R$ " + valorEntrada);
        System.out.println("Valor parcelado R$ " + valorParcelado);
        System.out.printf("%s%.0f%s", "Total taxa com meses: ", totalTaxa, "%");
        System.out.println();
        System.out.printf("%s%.2f", "Total do acréscimo R$: ", totalAcrescimo);
        System.out.println();
        System.out.printf("%s%.2f", "Total com acréscimo R$: ", valorTotalParceladoComAcrescimo);
        System.out.println();
        System.out.printf("%s%.2f", "Valor parcela: R$ ", valorParcela);

        entrada.close();

    }
}
