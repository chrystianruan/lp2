import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            int numero = sc.nextInt();
            vetor[i] = numero;
        }

        System.out.println("----------------------------------------------------");

        for (int i = tamanho-1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}