package secao5;

import java.util.Locale;
import java.util.Scanner;

/**
Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
 **/

public class Ex2Sec5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O numero eh PAR!!");
		}
		
		else {
			System.out.println("O numero eh IMPAR!!!");
		}
			
		sc.close();

	}

}
