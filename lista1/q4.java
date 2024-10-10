
import java.util.Scanner;

public class q4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        int perimetro = lado1 + lado2 + lado3;

        System.out.println("Perímetro: " + perimetro);

    }
}