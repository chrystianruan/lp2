import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano = sc.nextInt();

        if (isBissexto(ano)) {
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
    }

    private static boolean isBissexto(int ano) {
        if (ano % 4 == 0) {
            if (ano % 400 == 0) {
                return true;
            }
            if (ano % 100 == 0) {
                return false;
            }
            return true;
        }

        return false;
    }


}