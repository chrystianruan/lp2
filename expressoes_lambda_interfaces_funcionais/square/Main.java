public class Main {
    public static void main(String[] args) {
        Square square = number -> number * number;

        double num = 5.0;

        System.out.println("O quadrado de " + num + " é " + square.calculate(num));
    }
}
