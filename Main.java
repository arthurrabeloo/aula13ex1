public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Arthur", 1112);
        Cliente cliente2 = new Cliente("Duda", 1113);
        Cliente cliente3 = null;

        Conta conta = new Conta(600, 400);

        conta.AddCliente(cliente1);
        conta.AddCliente(cliente2);
        conta.AddCliente(cliente3);

        conta.mostraInfo();


        System.out.println("Fim da Main!");

    }

}