package secao4;

/**Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
decimais.
**/

import java.util.Locale;
import java.util.Scanner;

public class Ex4Sec4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		float pgtoHora = sc.nextFloat();

		float soma = (float) (pgtoHora * horasTrabalhadas);
		System.out.println("N�mero do funcionario: " + numeroFuncionario);
		System.out.println("Salario: " + soma);

		sc.close();

	}

}
