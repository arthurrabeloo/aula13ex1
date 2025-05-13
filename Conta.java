import java.util.*; // hashset

public class Conta {

    private float saldo;
    private float limite;
    private Set<Cliente> clientes = new HashSet<>();


    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void AddCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostraInfo() {
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("Limite: " + limite);


        for (Cliente cliente : clientes) {
            try {
                System.out.println("Nome do cliente: " + cliente.getNome());
                System.out.println("CPF do cliente: " + cliente.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Nao existe cliente!");
            }
        }
    }




}