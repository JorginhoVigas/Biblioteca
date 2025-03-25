package Biblioteca;
public class Livro {

    private String titulo;
    private int numeroPaginas;
    private Edicao edicao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Edicao getEdicao() {
        return edicao;
    }

    public void setEdicao(Edicao edicao) {
        this.edicao = edicao;
    }

    public Livro(String titulo, int numeroPaginas, Edicao edicao) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Dados do Livro {\n" +
               "  T�tulo: " + titulo + ",\n" +
               "  N�mero de P�ginas: " + numeroPaginas + ",\n" +
               "  Edi��o: " + (edicao != null ? edicao.toString() : "Nenhuma") + "\n" +
               "}";
    }
}
