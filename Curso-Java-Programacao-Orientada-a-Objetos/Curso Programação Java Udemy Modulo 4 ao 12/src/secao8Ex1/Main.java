package secao8Ex1;

import java.util.Locale;
import java.util.Scanner;

/*
  * Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar 
  * na tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto
  *      _______________________
  *     |	Rectangle		    |
  *     |_______________________|
  *     | - Width: Double	    |
  *     | - Height: Double      |
  *     |_______________________|
  *     | + Area(): double      |
  *     | + Perimeter(): double |
  *     | + Diagonal(): double  |
  *     |_______________________|
  */

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rect = new Rectangle();

		System.out.println("Enter rectangle width and height:");
		rect.whidth = sc.nextDouble();
		rect.height = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("Perimeter= %.2f%n", rect.perimeter());
		System.out.printf("Diagonal= %.2f%n", rect.diagonal());

		sc.close();

	}

}
