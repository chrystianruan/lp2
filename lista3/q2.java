import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorDesordenado = new int[10];

        for (int i = 0; i < 10; i++) {
            int numero = sc.nextInt();
            vetorDesordenado[i] = numero;
        }

        System.out.println("----------------------------------------------------");

        Arrays.sort(vetorDesordenado);

        for (int i = 9; i >= 0; i--) {
            System.out.println(vetorDesordenado[i]);
        }
    }
}