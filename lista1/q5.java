import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        int quociente = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
