import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas do Triângulo de Pascal que deseja imprimir: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(binomial(i, j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int fatorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fatorial(num - 1);
    }

    public static int binomial(int n, int k) {
        return fatorial(n) / (fatorial(k) * fatorial(n - k));
    }
}
