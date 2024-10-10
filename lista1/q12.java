import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double R1 = input.nextDouble();
        double R2 = input.nextDouble();
        double R3 = input.nextDouble();

        double R_eq = 1 / ((1 / R1) + (1 / R2));
        double R_total = R_eq + R3;

        System.out.println(R_total);
    }
}