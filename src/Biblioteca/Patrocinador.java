package Biblioteca;
public class Patrocinador {
    
    private String nome;
    private Editora editora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Patrocinador(String nome, Editora editora) {
        this.nome = nome;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Dados do Patrocinador: \n" +
               "  Nome: " + nome + ",\n" +
               "  Editora: " + (editora != null ? editora.toString() : "Nenhuma") + "\n" +
               "";
    }

}
