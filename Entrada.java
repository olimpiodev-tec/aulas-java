import java.util.Scanner;

public class Entrada {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine();
        
        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Seu nome: " + nome + " idade: " + idade);

        entrada.close();
    }
}
