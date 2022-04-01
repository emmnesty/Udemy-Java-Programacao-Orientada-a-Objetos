package secao5;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
 * negativo ou não.
 **/

public class Ex1Sec5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		
		if  (numero > 0) {
			System.out.println("O numero eh POSITIVO!");
		}
		else { 
			System.out.println("O numero eh NEGATIVO");
		}
		
			
		sc.close();

	}

}
