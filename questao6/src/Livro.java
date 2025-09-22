public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;

    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void Emprestar(){
        this.disponivel = false;
        System.out.println("Livro emprestado" + this.titulo);

    }

    public void Devolver(){
        this.disponivel = true;
        System.out.println("Livro devolvido" + this.titulo);
    }
}
