import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ItemOrcamento item1 = new ItemOrcamento("Material de construção", 500);
        ItemOrcamento item2 = new ItemOrcamento("Mão de obra", 1000);

        ArrayList<ItemOrcamento> subitens1 = new ArrayList<>();
        subitens1.add(item1);
        subitens1.add(item2);
        ItemOrcamentoComplexo itemComplexo1 = new ItemOrcamentoComplexo("Projeto de reforma", 200, subitens1);

        ItemOrcamento item3 = new ItemOrcamento("Consultoria", 300);

        ArrayList<ItemOrcamento> subitens2 = new ArrayList<>();
        subitens2.add(itemComplexo1);
        subitens2.add(item3);
        ItemOrcamentoComplexo itemComplexo2 = new ItemOrcamentoComplexo("Orçamento Total", 100, subitens2);

        System.out.println("Valor do item simples (item1): R$ " + item1.getValor());
        System.out.println("Valor do item simples (item2): R$ " + item2.getValor());
        System.out.println("Valor do item complexo (itemComplexo1): R$ " + itemComplexo1.getValor());
        System.out.println("Valor do item complexo total (itemComplexo2): R$ " + itemComplexo2.getValor());

        String historicoBusca = "Mão de obra";
        ItemOrcamento itemEncontrado = itemComplexo2.encontraItem(historicoBusca);

        if (itemEncontrado != null) {
            System.out.println("Item encontrado: " + itemEncontrado.getHistorico() + " com valor de R$ " + itemEncontrado.getValor());
        } else {
            System.out.println("Item com histórico '" + historicoBusca + "' não encontrado.");
        }
    }
}
