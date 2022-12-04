package terminalrestaurante;

public class Pratos {

    private int cod;
    private String nomePrato;
    private double valor;
    private String tamanho;

    public Pratos(int cod, String produto, double valor, String unidade) {
        this.cod = cod;
        this.nomePrato = produto;
        this.valor = valor;
        this.tamanho = unidade;
    }

    public String getUnidade() {
        return tamanho;
    }

    public void setUnidade(String unidade) {
        this.tamanho = unidade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getProduto() {
        return nomePrato;
    }

    public void setProduto(String produto) {
        this.nomePrato = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
