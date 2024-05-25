import java.util.Scanner;

/**
 *
 * @author aluno.ifal
 */
public class Imprimindo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("digite um numero");
        System.out.println("digite outro numero");
        float numero1 = in.nextInt();
        float numero2 = in.nextInt();
        System.out.println("A média entre os dois numeros foi:  " + (numero1+numero2)/2);
        
        
        
        
    }
    
}