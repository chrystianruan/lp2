import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double velocidadeMps = input.nextDouble();

        double velocidadeKmph = velocidadeMps * 3.6;

        System.out.println("Velocidade em km/h: " + velocidadeKmph);
    }
}