
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letra = sc.nextLine();

        System.out.println(resultado(letra));
    }

    private static boolean verificaExisteNaArray(String alvo, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (alvo.toUpperCase().equals(array[i].toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    private static String resultado(String texto) {
        String[] vogais = {"a", "e", "i", "o", "u"};
        String[] consoantes = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

        if (verificaExisteNaArray(texto, vogais)) {
            return "vogal";
        }

        if (verificaExisteNaArray(texto, consoantes)) {
            return "consoante";
        }

        try {
            double numberString = Double.parseDouble(texto);

            return "número";
        } catch (NumberFormatException e) {
            return "símbolo";
        }
    }


}