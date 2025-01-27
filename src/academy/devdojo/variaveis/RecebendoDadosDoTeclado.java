package academy.devdojo.variaveis;

import java.util.Scanner;

public class RecebendoDadosDoTeclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.next(); // armazena o nome
		System.out.println("Qual sua idade? ");
		int idade = sc.nextInt();
		System.out.println("Nome digitado foi: " + nome);
		System.out.println("Digite sua idade: " + idade);
		
		sc.close();
	}

}
