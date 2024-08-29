
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Variaveis

        String nomeCliente;
        String agencia;
        int numeroConta;
        double saldoBancario = 0;

        //Corpo do Projeto

        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, Seja Bem Vindo ao Banco InDebt!" +
        " Digite o seu Nome completo por favor:");

        nomeCliente = leitor.nextLine();

        System.out.println("Agora iremos precisar que me informe a Agência:");

        agencia = leitor.next();

        System.out.println("Em seguinda, o número da Conta:");

        numeroConta = leitor.nextInt();

        System.out.println("Seu Saldo atual é " + saldoBancario + ", Me informe qual valor será depositado?");

        saldoBancario = leitor.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência: " +
         agencia + ", conta: " + numeroConta + " e seu saldo atual: " + saldoBancario + " já está disponível para saque.");

    }
}
