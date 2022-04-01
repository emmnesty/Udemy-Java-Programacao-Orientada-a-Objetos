package secao4;
// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class Ex1Sec4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();

		int soma = valor1 + valor2;
		System.out.println(soma);

		sc.close();
	}

}
