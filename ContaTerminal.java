import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o número da sua agência");
			int Numero = terminal.nextInt();
			System.out.println("Digite a sua agencia");
			String Agencia = terminal.next();
			System.out.println("Digite o seu nome");
			String Nome = terminal.next();
			System.out.println("Digite o seu saldo");
			double Saldo = terminal.nextDouble();
		
			System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
		

		}
}
}