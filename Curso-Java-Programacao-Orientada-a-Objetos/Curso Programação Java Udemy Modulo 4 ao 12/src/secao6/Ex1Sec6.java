package secao6;

import java.util.Scanner;

public class Ex1Sec6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != y) {
			if (x < y)
				System.out.println("Crescente!");

			else {
				System.out.println("Descrescente!");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();

	}

}
