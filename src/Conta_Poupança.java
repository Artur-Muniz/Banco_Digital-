public class Conta_Poupança extends Conta{
    public Conta_Poupança(Cliente customer) {
        super(customer);
    }

    @Override
    protected void Extrato() {
        System.out.println("\n*** Extrato Conta Poupança");
        super.Extrato();
    }
}
