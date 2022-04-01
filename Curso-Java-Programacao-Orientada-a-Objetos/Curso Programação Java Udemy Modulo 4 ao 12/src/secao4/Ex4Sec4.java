package secao4;

/**Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
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
		System.out.println("Número do funcionario: " + numeroFuncionario);
		System.out.println("Salario: " + soma);

		sc.close();

	}

}
