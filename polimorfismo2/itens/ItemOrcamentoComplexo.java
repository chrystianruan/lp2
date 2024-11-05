import java.util.ArrayList;

public class ItemOrcamentoComplexo extends ItemOrcamento {
    private ArrayList<ItemOrcamento> subitens;

    public ItemOrcamentoComplexo(String historico, float valor, ArrayList<ItemOrcamento> subitens) {
        super(historico, valor);
        this.subitens = subitens;
    }

    @Override
    public float getValor() {
        float valorTotal = super.getValor();
        for (ItemOrcamento item : subitens) {
            valorTotal += item.getValor();
        }
        return valorTotal;
    }

    public ItemOrcamento encontraItem(String historico) {
        for (ItemOrcamento item : subitens) {
            if (item.getHistorico().equals(historico)) {
                return item;
            }
            if (item instanceof ItemOrcamentoComplexo) {
                ItemOrcamento encontrado = ((ItemOrcamentoComplexo) item).encontraItem(historico);
                if (encontrado != null) {
                    return encontrado;
                }
            }
        }
        return null;
    }
}
