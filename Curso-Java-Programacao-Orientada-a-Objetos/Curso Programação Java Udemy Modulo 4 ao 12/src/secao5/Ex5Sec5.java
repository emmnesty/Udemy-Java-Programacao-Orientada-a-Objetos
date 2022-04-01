package secao5;

import java.util.Locale;
import java.util.Scanner;

/**
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 **/

public class Ex5Sec5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int codigo = sc.nextInt();
		int quantidadeItem = sc.nextInt();
		double preco;

		if (codigo == 1) {
			preco = quantidadeItem * 4.0;
		}

		else if (codigo == 2) {
			preco = quantidadeItem * 4.5;

		}

		else if (codigo == 3) {
			preco = quantidadeItem * 5.0;

		}

		else if (codigo == 4) {
			preco = quantidadeItem * 2.0;

		}

		else {
			preco = quantidadeItem * 1.5;

		}

		System.out.printf("Total: R$ %.2f%n", preco);

		sc.close();

	}

}
