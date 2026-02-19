import java.util.Scanner;

public class Imc {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Olá, vamos calcular seu IMC");

        System.out.println("Qual sua altura?");
        double altura = s.nextDouble();

        System.out.println("Qual seu peso?");
        int peso = s.nextInt();

        if (altura <= 0 || peso <= 0) {
            System.err.println("Informações inválidas");
        } else {
            double rs = peso / (altura * altura);
            System.out.printf("O IMC é %.2f", rs);
            System.out.println();

            if (rs < 18.5) {
                System.out.println("Classificação: Baixo peso");
            } else if (rs >= 18.5 && rs <= 24.9) {
                System.out.println("Classificação: Peso normal");
            } else if (rs >= 25 && rs <= 29.9) {
                System.out.println("Classificação: Sobrepeso");
            } else if (rs >= 30 && rs <= 34.9) {
                System.out.println("Classificação: Obesidade grau I");
            } else if (rs >= 35 && rs <= 39.9) {
                System.out.println("Classificação: Obesidade grau II");
            } else {
                System.out.println("Classificação: Obesidade grau III");
            }
        }

        s.close();
    }
}