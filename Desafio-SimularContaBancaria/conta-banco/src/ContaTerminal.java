import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {      
               
        double saldo = 237.48d;

        Scanner dados = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta: ");
        int numero = dados.nextInt();

        System.out.println("Por favor, digite o numero da agência: ");
        String agencia = dados.next();

        System.out. println("Por favor, digite o nome o seu nome: ");
        String nomeCliente = dados.next();  

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
        " sua agência " + agencia + ", conta " + numero + " e seu saldo R$ " +  saldo +
         " já está disponível para saque");       
    }
    
}
