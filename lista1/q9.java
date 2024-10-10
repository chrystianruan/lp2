import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        List<String> binario = new ArrayList<>();

        if (numero < 32) {
            for (int i = 4; i >= 0; i--) {
                int bit = (numero >> i) & 1;
                binario.add(String.valueOf(bit));
            }
        }

        System.out.println("Número binário: " + String.join("", binario));
    }
}