package secao4;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
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
