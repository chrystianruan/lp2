import java.util.Date;

class BoletoBancario extends Pagamento implements Autenticacao {
    private String codigoBoleto;
    private Date dataValidade;

    public BoletoBancario(String codigoBoleto, Date dataValidade) {
        this.codigoBoleto = codigoBoleto;
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean autenticar() {
        System.out.println("Verificando validade do boleto " + codigoBoleto + "...");
        if (dataValidade > new Date()) {
            return false;
        }
        return true;
    }

    @Override
    public void realizarPagamento(double valor) {
        if (autenticar()) {
            System.out.println("Pagamento de R$" + valor + " realizado via Boleto Bancário.");
        } else {
            System.out.println("Falha na validação do Boleto Bancário.");
        }
    }
}