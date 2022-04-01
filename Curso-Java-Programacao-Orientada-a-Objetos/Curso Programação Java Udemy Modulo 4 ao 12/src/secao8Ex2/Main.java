package secao8Ex2;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler os dados de um funcionário (Nome, Sálario Bruto e Imposto). Em seguida, mostrar os dados
 * do funcioário (nome e sálario liquído). Em seguida, aumentar o sálario do funcionário com base em uma porcentagem
 * dada (Somente o sálario bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Usar classe 
 * projetada abaixo.
  *      ____________________________________________
  *     |	     		Employee   					 |
  *     |____________________________________________|
  *     | - Name: String	    					 |
  *     | - GrossSalary: Double 					 |
  *     | - Tax: Double         					 |
  *     |____________________________________________|
  *     | + NextSalary(): double                     |
  *     | + IncreaseSalary (percentage: double): void|
  *     |   										 |	
  *     |____________________________________________|				 					 
  */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Gross salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + func);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + func);
		
		
		sc.close();

	}

}
