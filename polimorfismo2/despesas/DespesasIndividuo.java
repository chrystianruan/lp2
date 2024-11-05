import java.util.ArrayList;

public class DespesasIndividuo {
    private String cpf;
    private ArrayList<DespesaMes> despesas;

    public DespesasIndividuo(String cpf, ArrayList<DespesaMes> despesas) {
        this.cpf = cpf;
        this.despesas = despesas;
    }

    public String getCPF() {
        return cpf;
    }

    public DespesaMes totalizaMes(int mes) {
        float total = 0;

        for (DespesaMes despesa : despesas) {
            if (despesa.getMes() == mes) {
                total += despesa.getValor();
            }
        }

        return new DespesaMes(mes, total);
    }
}
