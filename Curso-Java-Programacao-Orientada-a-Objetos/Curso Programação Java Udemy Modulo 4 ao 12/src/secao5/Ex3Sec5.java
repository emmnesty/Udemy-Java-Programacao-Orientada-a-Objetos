package secao5;

import java.util.Scanner;

/**Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
ordem crescente ou decrescente.**/

public class Ex3Sec5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt();
		
		if (A % B == A || B % A == B) {
			System.out.println("SAO Multiplos");
		}
		else {
			System.out.println("NAO MULTIPLOS");
		
		}
		
		
		
		sc.close();

	}

}
