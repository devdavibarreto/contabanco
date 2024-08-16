import java.util.Locale;
import java.util.Scanner;

public class ContaTermina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" Digite o Número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o Número da agencia:");
        String agencia = scanner.next();

        System.out.println("Confirme seu nome completo por favor:");
        String nome = scanner.next();

        System.out.println("Seu saldo:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá  " + nome + " ,obrigado por criar uma conta em nosso banco, sua agência é  " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
