package secao4;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
 * valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
 * o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
 **/

public class Ex5Sec4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroPecas1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		int numeroPecas2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();

		double valorASerPago = (valorPeca1 * numeroPecas1 + valorPeca2 * numeroPecas2);
		System.out.println("O valor a ser pago eh: R$" + valorASerPago);

		sc.close();

	}

}
