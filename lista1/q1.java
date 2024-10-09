
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();
        int base = sc.nextInt();

        int area = altura * base;
        int perimetro = (2*altura) + (2*base);

        System.out.println("A área é " + area + " e o perímetro é " + perimetro);
    }
}