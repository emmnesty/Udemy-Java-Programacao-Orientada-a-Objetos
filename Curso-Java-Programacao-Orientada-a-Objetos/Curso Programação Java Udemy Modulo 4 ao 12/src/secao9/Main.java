/**Um programa para cadastro de conta banc�ria, informar numero da conta, nome do titular, valor de dep�sito inicial (deve ser opcional). 
 * Numero da conta n�o poder� ser mudado. Nome do titular pode. Mecanismo para evitar que o saldo seja alterado. 
 * O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque realizado, 
 * o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for suficiente 
 * para realizar o saque e/ou pagar a taxa. **/

package secao9;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account; 												// Inst�ncia a classe Account

		System.out.print("Enter account number: ");
		int number = sc.nextInt();										// Variavel (int) tempor�ria para receber o dado digitado
		System.out.print("Enter account holder: ");
		sc.nextLine();													// Quebra de linha, por isso o param�tro vazio
		String holder = sc.nextLine();									// Vari�vel (String) tempor�ria para receber o dado digitado
		System.out.print("Is there an initial deposit (y/n)? ");
		
		char response = sc.next().charAt(0);							// Vari�vel (tipo char Sim ou N�o) tempor�ria para receber o dado digitado
		if (response == 'y') {											// Estrutura condicional testa a v�riavel armazenada em char response (y ou n)
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();					// vari�vel depositoInicial armazena o dado digitado (double)

			account = new Account(number, holder, initialDeposit);		// Meu construtor (3 atributos) da classe Account instanciado anteriormente
		} else {														
			account = new Account(number, holder);						// Meu construtor (2 atributos) da classe Account instanciado anteriormente
		}

		System.out.println();											// Printar uma linha vazia
		System.out.println("Account data:");							// print "Dados da conta: "
		System.out.println(account);									// print da v�riavel account instanciada e declarada no m�todo Account

		System.out.println();											// Printar uma linha vazia
		
		System.out.print("Enter a deposit value: ");					// print "entre com o valor do dep�sito: "
		double depositValue = sc.nextDouble();							// vari�vel valorDoDeposito solicita e armazena o dado digitado (double)
		account.deposit(depositValue);									/** faz a chamada do m�todo estatico deposito na classe Account que soma
																		o valor do saldo ao saque **/
		
		System.out.println("Updated account data:");					// print "Dados da Conta Atualizado: "
		System.out.println(account);									// printa o valor armazenada na variavel account

		System.out.println();											// Printar uma linha vazia
		
		System.out.print("Enter a withdraw value: ");					// print "entre com o valor do saque: "
		double withdrawValue = sc.nextDouble();							// vari�vel valorDosaque solicita e armazena o dado digitado (double)
		account.withdraw(withdrawValue);								/** faz a chamada do m�todo estatico saque na classe Account que subtrai
																			o valor do saldo e a taxa de  5% **/
		
		System.out.println("Updated account data:");					// print "Valor atualizado da conta: "
		System.out.println(account);									// print "Dados da conta: 

		sc.close();
	}
}