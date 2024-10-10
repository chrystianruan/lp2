import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double altura = input.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("Volume: "+ volume);
    }
}
