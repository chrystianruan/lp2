import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        do {
            senha = sc.nextLine();

            if (senha.equals("1234")) {
                System.out.println("ACESSO PERMITIDO");
                break;
            }

            System.out.println("ACESSO NEGADO");


        } while (!senha.equals("1234"));

    }

}