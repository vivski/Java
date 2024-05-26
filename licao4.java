public class PrincipalBanco {
    public static void main(String[] args) {
        
        // 2 Clientes
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Fulano");
        cliente1.setEndereco("Rua Qualquer, 00");
        cliente1.setTelefone("(82) 1111-1111");
        cliente1.setRg("01010101");
        cliente1.setCpf("111.111.111-11");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Ciclano");
        cliente2.setEndereco("Rua Qualquer, 01");
        cliente2.setTelefone("(82) 2222-2222");
        cliente2.setRg("02020202");
        cliente2.setCpf("222.222.222-22");

        // 3 Contas bancárias
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroConta("12345-6");
        conta1.setNumeroAgencia("7890-1");
        conta1.setSaldo(1000.0);
        conta1.setCorrentista(cliente1);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNumeroConta("65432-1");
        conta2.setNumeroAgencia("0987-6");
        conta2.setSaldo(2000.0);
        conta2.setCorrentista(cliente1);

        ContaBancaria conta3 = new ContaBancaria();
        conta3.setNumeroConta("98765-4");
        conta3.setNumeroAgencia("4321-0");
        conta3.setSaldo(3000.0);
        conta3.setCorrentista(cliente2);

        // Operações
        conta1.depositar(500.0);
        conta1.sacar(200.0);

        conta2.depositar(1000.0);
        conta2.sacar(500.0);

        conta3.depositar(1500.0);
        conta3.sacar(1000.0);

        // Exibir saldos
        System.out.println("Saldo da conta 1: R$" + conta1.getSaldo());
        System.out.println("Saldo da conta 2: R$" + conta2.getSaldo());
        System.out.println("Saldo da conta 3: R$" + conta3.getSaldo());
    }
}