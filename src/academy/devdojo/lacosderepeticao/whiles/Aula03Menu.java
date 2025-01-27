/*
 * Eu como usuário gostaria de ter um menu visual que seja navegável através de números.
 * O menu deve ser exibido da seguinte forma:
 * 1.Depositar salário
 * 2.Calcular imposto
 * 3.Sair
 * O menu deve ficar disponível enquanto eu não digitar o número 3.
 * Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada aoperação.
 */

package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while (menu != 3) {
			System.out.println("1.Depositar salário");
			System.out.println("2.Calcular imposto");
			System.out.println("3.Sair");
			System.out.println("Digite a opção desejada: ");
			menu = sc.nextInt();
			
			sc.close();
		}
		System.out.println("Fim do programa");
		
	}

}
