public class App {
    public static void main(String[] args) throws Exception {
        Pessoa Fernando = new Pessoa(30,"Fernando"); 
        Pessoa João = new  Pessoa(29, "João"); 
        System.out.println("Nome: "+Fernando.nome+" Idade: "+Fernando.idade);
        System.out.println("Nome: "+João.nome+" Idade: "+João.idade);
    }
}
