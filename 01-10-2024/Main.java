import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number1;

        System.out.println(number1 + " " + number2);
    }
}
