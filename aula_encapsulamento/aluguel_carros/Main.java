public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Chrys", "122");
        Carro carro1 = new Carro("Chevrolet", "Celta", "azul", "SXJJ1993", 2017);
        Carro carro2 = new Carro("Volkswagem", "Gol", "preto", "SAJSDJD3", 2012);
        Carro carro3 = new Carro("Fiat", "Palio", "branco", "GHGGH9G5", 2012);
        Carro carro4 = new Carro("Toyota", "Corolla", "prata", "FDSVVFG3", 2020);

        Reserva reserva = new Reserva();

        try {
            reserva.reservar(carro1, cliente);
            reserva.reservar(carro2, cliente);
            reserva.reservar(carro1, cliente);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
