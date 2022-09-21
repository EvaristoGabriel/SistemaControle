package brufjfdcc025.sistemacontrole;
public class Produto {
    private String nome, descricao;
    private int quantidade;
    private float valor;

    public Produto(String nome, String descricao, int  quantidade, float  valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.nome + "    |   " + this.valor + "  |   " + this.quantidade + " |   " + this.descricao;
    }
    
    
}
