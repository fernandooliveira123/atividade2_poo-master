public class ContaBancaria {    
    private int NumerodaConta;
    private double Saldo;
    public ContaBancaria(int numerodaConta, double saldo) {
        NumerodaConta = numerodaConta;
        Saldo = saldo;
    }
    public void depositar (double valor){
        Saldo += valor;
    }
    public void sacar(double valor){
        Saldo -= valor;
    }

    public double getSaldo() {
        return Saldo;
    }

    public int getNumerodaconta() {
        return NumerodaConta;
    }
}

