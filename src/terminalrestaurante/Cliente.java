package terminalrestaurante;

public class Cliente {

    private int codCliente;
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(int codCliente, String nome, String cpf, String endereco) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
