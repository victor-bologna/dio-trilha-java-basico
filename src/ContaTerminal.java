import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\n");

        System.out.println("Digite a número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite a agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scanner.next();

        System.out.println("Digite seu saldo atual:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}