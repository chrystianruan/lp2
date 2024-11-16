class PIX extends Pagamento implements Autenticacao {
    private String chavePix;

    public PIX(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean autenticar() {
        if (chavePix < 7) {
            return false;
        }
        return true;
    }

    @Override
    public void realizarPagamento(double valor) {
        if (autenticar()) {
            System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
        } else {
            System.out.println("Falha na autenticação do PIX.");
        }
    }
}