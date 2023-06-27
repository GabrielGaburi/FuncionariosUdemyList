package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		ArrayList<Dados> lista = new ArrayList<Dados>();

		System.out.println("Digíte a quantidade de funcionarios a serem cadastrados: ");
		int n = leia.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o ID do " + (i + 1) + "º Funcionário:");
			Integer id = leia.nextInt();
			while (existeId(lista, id)) {
				System.out.print("ID já cadastrado, por favor digíte outro Id: ");
				id = leia.nextInt();
			}
			System.out.println("Digite o nome do " + (i + 1) + "º Funcionário:");
			leia.nextLine();
			String nome = leia.nextLine();
			System.out.println("Digite o salário do " + (i + 1) + "º Funcionário:");
			Double salario = leia.nextDouble();

			Dados fun = new Dados(id, nome, salario);

			lista.add(fun);

		}

		System.out.println("Digíte o id do Funcionario que o salário vai ser aumentado:");
		int idSalario = leia.nextInt();

		Dados fun = lista.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);

		if (fun == null) {
			System.out.println("Este ID não existe!");

		} else {
			System.out.println("Entre com a porcentagem: ");
			Double porcentagem = leia.nextDouble();
			fun.aumento(porcentagem);
		}

		System.out.println();
		System.out.println("Lista de Funcionários: ");
		for (Dados fun1 : lista) {
			System.out.println(fun1);
		}

	}
	public static boolean existeId(List<Dados> list, int id) {
		Dados emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
