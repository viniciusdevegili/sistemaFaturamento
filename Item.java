public class Item {
    private String nomeItem;
    private int quantidade;
    private double valor;

    public Item(String nomeItem, int quantidade, double valor) {
        super();
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
