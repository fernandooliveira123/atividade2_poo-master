public  class Main  {
    public static void main(String[] args) {}
    Biblioteca biblioteca = new Biblioteca(5);

    Livro livro1 = new Livro("Game of Thrones", "George R. R. Martin");
    Livro livro2 = new Livro("senhor dos aneis", "J.R.R. Tolkien");
    Livro livro3 = new Livro("harry potter e a pedra filosofal", "J.K. Rowling");

    biblioteca.adicionarLivro(livro1);
    biblioteca.adicionarLivro(livro2);
    biblioteca.adicionarLivro(livro3);

    biblioteca.mostrarlivros();

    biblioteca.emprestarlivro("Game of Thrones");
    biblioteca.devolverlivro("Game of Thrones");

    biblioteca.mostrarlivros();
}

