package Biblioteca;
public class Editora {
    
    private String codigo;
    private String nome;
    private Endereco endereco;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Editora(String codigo, String nome, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Dados da Editora {\n" +
               "  Código: " + codigo + ",\n" +
               "  Nome: " + nome + ",\n" +
               "  Endereço: " + (endereco != null ? endereco.toString() : "Nenhum") + "\n" +
               "}";
    }

}
