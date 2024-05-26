
public class Cliente {
    
    private String nome;
    private String endereco;
    private String telefone;
    private String rg;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
    
        cliente.setNome("Fulano de Tal");
        cliente.setEndereco("Rua das Flores, 123");
        cliente.setTelefone("(99) 99999-9999");
        cliente.setRg("12345678");
        cliente.setCpf("123.456.789-00");
    
        cliente.imprimir();
    }
    
}