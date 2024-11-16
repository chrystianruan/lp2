public class Main {
    public static void main(String[] args) {
        Funcionario horista = new FuncionarioHorista("Carlos", 1000.00, 170, 20.00);
        Funcionario assalariado = new FuncionarioAssalariado("Ana", 3000.00);

        horista.exibirSalario();
        assalariado.exibirSalario();
    }
}
