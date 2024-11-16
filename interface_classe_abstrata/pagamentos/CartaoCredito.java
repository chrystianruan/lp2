import java.util.Date;

class CartaoCredito extends Pagamento implements Autenticacao {
    private String numeroCartao;
    private String titular;
    private Date validade;
    private String cvv;

    public CartaoCredito(String numeroCartao, String titular, String validade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.validade = validade;
        this.cvv = cvv;
    }

    @Override
    public boolean autenticar() {
        System.out.println("Autenticando cartão de crédito " + numeroCartao + "...");]
        if ((numeroCartao.length > 16 || numeroCartao.length < 13) || (cvv.length > 3 || cvv.length < 3) || (validade < new Date())) {
            return false;
        }
        return true;
    }

    @Override
    public void realizarPagamento(double valor) {
        if (autenticar()) {
            System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
        } else {
            System.out.println("Falha na autenticação do Cartão de Crédito.");
        }
    }
}
