/**Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
N funcion�rios. N�o deve haver repeti��o de id.
Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
conforme exemplos.
Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
aumento por porcentagem dada. **/

package secao10Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregados> list = new ArrayList<>();

		// PARTE 1 - ENTRADA DE DADOS:

		System.out.println("Quantos funcion�rios ser�o registrados: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Empregado #" + i + ": ");

			System.out.print("ID: ");
			int id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.print("Id j� existe. Tente novamente: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			list.add(new Empregados(id, name, salary));
		}

		// PARTE 2 - ATUALIZA��O DO SAL�RIO DE DETERMINADO EMPREGADO:

		System.out.println();
		System.out.print("Insira o ID do funcion�rio que ter� aumento salarial: ");
		int id = sc.nextInt();
		Empregados emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Esse ID n�o existe!");
		} else {
			System.out.print("Entre com a portcentagem: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		// PARTE 3 - LISTANDO EMPREGADOS:

		System.out.println();
		System.out.println("List of employees:");
		for (Empregados obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

	public static boolean hasId(List<Empregados> list, int id) {
		Empregados emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
