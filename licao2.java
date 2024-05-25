/* conta bancária */


Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;

/**
 *
 * @author aluno.ifal
 */
public class ContaBancaria {
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public static void main(String[] args){
    ContaBancaria minhaConta = new ContaBancaria();
    
    minhaConta.setNumeroConta("12345-6");
    minhaConta.setNumeroAgencia("7890-1");
    minhaConta.setSaldo(1000.0);
    
    System.out.println("Número da conta: " + minhaConta.getNumeroConta());
    System.out.println("Número da agência: " + minhaConta.getNumeroAgencia()); 
    System.out.println("Saldo: R$" + minhaConta.getSaldo());
    }
}