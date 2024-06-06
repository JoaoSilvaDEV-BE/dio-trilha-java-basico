
// TODO: Conhecer e importar a classe Scanner
// TODO: Exibir as mensagens para o nosso usuário
// TODO: Obter pela scanner os valores digitados no terminal
// TODO: Exibir a mensagem de criação de conta
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome, depois ENTER para o próximo campo: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome, depois ENTER para o próximo campo: ");
        String sobreNome = scanner.next();

        System.out.println("Por favor digite o numero da Conta, depois ENTER para o próximo campo: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor digite o numero da Agência, depois ENTER para o próximo campo: ");
        String agencia = scanner.next();

        System.out.println("Saldo Atual: ");
        double saldo = scanner.nextDouble();

        // Imprimindo os dados pelo usuario
        System.out.println("Bem vindo, " + nome + " " + sobreNome + " obrigado por criar uma conta em nosso banco!");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Seu saldo R$: " + saldo + " já está disponível para saque");

    }
}
