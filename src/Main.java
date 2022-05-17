public class Main {
    public static void main(String[] args) {
        // Customer
        Cliente JOAO = new Cliente();
        JOAO.setName("Joao");
        JOAO.setCpf(542_133_44);

        // Accounts
        Conta checkingAccount = new Conta_Corrente(JOAO);
        Conta savingAccount = new Conta_Poupança(JOAO);

        // Actions
        checkingAccount.emprestimo(1000);
        checkingAccount.tranferencia(300, savingAccount);

        // Outputs
        checkingAccount.Extrato();
        savingAccount.Extrato();


    }
}
