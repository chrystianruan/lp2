public class Main {
    public static void main(String[] args) {
        Pagamento cartaoCredito = new CartaoCredito("1234-5678-9876-5432", "João Silva", "12/25", "123");
        cartaoCredito.realizarPagamento(150.00);

        Pagamento boletoBancario = new BoletoBancario("12345678901234567890");
        boletoBancario.realizarPagamento(200.00);

        Pagamento pix = new PIX("joao@gmail.com");
        pix.realizarPagamento(50.00);
    }
}
