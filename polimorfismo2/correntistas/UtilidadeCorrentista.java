import java.util.ArrayList;

public class UtilidadeCorrentista {

    public static ArrayList<CorrentistaDespesa> filtraCorrentistasSaldoPositivo(CorrentistaDespesa[] correntistas) {
        ArrayList<CorrentistaDespesa> resultado = new ArrayList<>();

        for (CorrentistaDespesa correntista : correntistas) {
            DespesaMes despesasMar = correntista.getDespesasPrevistas().totalizaMes(3);

            if (despesasMar.getValor() <= correntista.getSaldo()) {
                resultado.add(correntista);
            }
        }

        return resultado;
    }
}
