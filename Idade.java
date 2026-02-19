import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = s.nextInt();

        String rs = (idade >= 18) ? "Maior" : "Menor";

        System.out.println("Você é " + rs + " de idade");

        s.close();
    }
}
