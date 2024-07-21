import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);        
       
        // Exibir mensagens para o usuário
        System.out.println("Digite o numero da conta: ");
       
        //Obter pela Scanner os valores digitados pelo usuário
        int numero = scanner.nextInt();

        System.out.println("Digite a agência ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        //Exibir informações da conta criada. 
        System.out.println("Olá ".concat(nomeCliente) + " obrigado por criar uma conta em nosso banco.\n" +
                        "Sua agencia é [".concat(agencia) + "], conta [".concat(String.valueOf(numero)) +  
                        "] e seu saldo R$".concat(String.valueOf(saldo)) + " já está disponivel para o saque.");
        scanner.close();
    }
}
