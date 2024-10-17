public class ContaBancaria {

    private String agencia;
    private String numero;
    private double saldo;
    private Cliente cliente;

    public ContaBancaria(String agencia, String numero, Cliente cliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
