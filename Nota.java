import java.util.Scanner;

public class Nota {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Olá seja bem vindo, vamos calcular a média");

        System.out.println("Digite a primeira nota");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.printf("Aprovado com média %.2f", media);
        } else {
            System.out.printf("Reprovado com média %.2f", media);
        }

        entrada.close();
    }
}