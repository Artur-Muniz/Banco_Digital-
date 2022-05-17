public class Conta_Corrente extends Conta{

    public Conta_Corrente(Cliente customer) {
        super(customer);
    }

    protected void Extrato(){
        System.out.println("\n*** Extrato Conta Corrrente ***");
        super.Extrato();
    }
}
