
import java.util.Scanner;

public class q1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        System.out.println(resultado(nota1, nota2, nota3));


    }

    private static String resultado(double nota1, double nota2, double nota3) {
        double soma = nota1 + nota2 + nota3;
        double media = soma/3;
        double pontosNecessariosParaPassar = 15-soma; //media 5 na reposicao

        //minimo de 4 pontos
        if (pontosNecessariosParaPassar < 4) {
            pontosNecessariosParaPassar = 4;
        }

        if ((nota1 < 4 || nota2 < 4 || nota3 < 4) && media > 3) {
            return "Prova de reposição precisando de no mínimo "+ pontosNecessariosParaPassar;
        }

        if (media > 3 && media < 6) {
            return "Prova de reposição precisando de no mínimo "+ pontosNecessariosParaPassar;
        }

        if (media < 3) {
            return "Reprovado";
        }

        if (media > 6 && media < 7) {
            return "Aprovado por média";
        }

        return "Aprovado por nota";
    }
}