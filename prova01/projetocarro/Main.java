import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", "Celta", 2015);
        Carro carro2 = new Carro("Toyota", "Hilux", 2019);
        Carro carro3 = new Carro("Fiat", "Siena", 2013);
        List<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        for (int i = 0; i < carros.size(); i++) {
            int posicao = i+1;
            System.out.println("Carro " + posicao + ": " + carros.get(i).getMarca() + " - " + carros.get(i).getModelo() + " - " + carros.get(i).getAno());
        }
    }
}
