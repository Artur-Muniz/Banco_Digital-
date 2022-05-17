public class Conta {

    // Account
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double tranferencia;
    protected double emprestimo;
    protected double divida;

    // Account Defaults
    private static int CONTADOR = 1;
    protected static final int Agencia = 1;
    private Cliente customer;

    // Getters
    public int getAgencia() {return agencia;}
    public int getNumero() {return numero;}
    public double getSaldo() {return saldo;}
    public double getDivida() {return divida;}

    // Actions
    public void sacar(double valor){saldo -= valor;}
    public void depositar(double valor){saldo += valor;}
    public void tranferencia(double valor, Conta contaDestino){this.sacar(valor); contaDestino.depositar(valor);}
    public void emprestimo(double valor){divida = (valor*10)/100; saldo += valor;}

    // Bank Costumer
    public Conta(Cliente customer){
        this.agencia = Conta.Agencia;
        this.numero = CONTADOR++;
        this.customer = customer;
    }

    // Bank Balance
    protected void Extrato(){
        System.out.println(String.format("Titular: %s", Cliente.getName()));
        System.out.println(String.format("Titular: %d", Cliente.getCpf()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
        System.out.println(String.format("Saldo Devedor: %.2f", divida));
    }

    //
}
