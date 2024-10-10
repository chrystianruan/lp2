import java.util.Scanner;

public class q3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextFloat();

        final double pi = 3.1415;
        double area = pi * raio * raio;
        double perimetro = 2*pi*raio;
        double circuferencia = perimetro;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Circuferência: " + circuferencia);

    }
}