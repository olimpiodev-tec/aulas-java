import java.util.Scanner;

public class Figuras {
   public static void main(String args[]) {
        // Calcule a área do círculo
        // com informações dinâmicas
        // PI * (raio * raio)
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o raio do círculo?");
        float raio = entrada.nextFloat();
        
        float area = (float) (Math.PI * (raio * raio));
        double areaD = Math.PI * (raio * raio);

        System.out.println("A área do círculo é: " + area);
        System.out.printf("%s%.2f", "A área do círculo é: ", area);

        entrada.close();
   }
}