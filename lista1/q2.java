
import java.util.Scanner;

public class q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado = sc.nextInt();

        int area = lado * lado;
        int perimetro = 4*lado;

        System.out.println("A área é " + area + " e o perímetro é " + perimetro);
    }
}