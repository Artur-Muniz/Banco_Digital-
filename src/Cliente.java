public class Cliente {

    private static String name;
    private static int cpf;

    /////////////////////////////////////////////////////

    public void setName(String name) {Cliente.name = name;}
    public static String getName() {return name;}


    public void setCpf(int cpf) {Cliente.cpf = cpf;}
    public static int getCpf() {return cpf;}
}
