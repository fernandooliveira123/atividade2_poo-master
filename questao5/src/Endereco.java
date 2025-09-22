public class Endereco  {
    private String Rua;
    private int Numero;

    public Endereco(String rua, int numero) {
        Rua = rua;
        Numero = numero;
    }

    public String getRua() {
        return Rua;
    }

    public int getNumero() {
        return Numero;
    }
}
