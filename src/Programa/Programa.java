package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Contribuinte;
import Entidades.Pessoa_Fisica;
import Entidades.Pessoa_Juridica;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Contribuinte> lista = new ArrayList<>();

		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();

		for (int x = 1; x <= n; x++) {
			System.out.println("Dados do contribuinte número #" + x + ":");
			System.out.print("Pessoa Física ou Jurídica (f/j): ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			if (tipo == 'f') {
				System.out.print("Gastos com saúde: ");
				double saude = sc.nextDouble();
				lista.add(new Pessoa_Fisica(nome, renda, saude));
			} 
			else {
				System.out.print("Número de funcionários: ");
				int funcionarios = sc.nextInt();
				lista.add(new Pessoa_Juridica(nome, renda, funcionarios));
			}
		}
		System.out.println();
		System.out.println("Impostos pagos:");
		for (Contribuinte y : lista) {
			System.out.println(y.getNome() + ": R$" + String.format("%.2f", y.imposto()));
		}
		System.out.println();
		System.out.println("Total de impostos:");
		sc.close();
	}
}
