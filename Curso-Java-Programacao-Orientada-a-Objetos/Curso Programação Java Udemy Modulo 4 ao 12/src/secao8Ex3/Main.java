package secao8Ex3;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler o nome de um aluno e as tr�s notas que ele
 * obteve nos tr�s trimestres do ano (primeiro trimestre vale 30 e o segundo e
 * terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano.
 * Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso
 * negativo, quantos pontos faltam para o aluno obter o min�mo para ser
 * aprovado (que � 60% da nota). Voc� deve criar uma classe Student para
 * resolver este problema.
 * 
 **/

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();

	}

}
