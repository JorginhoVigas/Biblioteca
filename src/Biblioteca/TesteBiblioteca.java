package Biblioteca;

public class TesteBiblioteca {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Viana Bandeira", 27);
        Editora editora = new Editora("L001", "Editora Cartman", endereco);
        Patrocinador patrocinador = new Patrocinador("Felipe Reborn", editora);
        Edicao edicao = new Edicao(1, 2025, patrocinador);
        Livro livro = new Livro("Programação para FIVEM", 350, edicao);
        
        System.out.println(livro);
    }
}