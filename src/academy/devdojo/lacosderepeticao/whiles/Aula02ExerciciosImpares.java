// Eu como usuário gostaria de imprimir todos os números ímpares de 0 até o valor digitado pelo usuário

package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExerciciosImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor desejado: ");
		int valorFinal = sc.nextInt();
		int i = 0;
		while (i <= valorFinal) {
			if (i % 2 != 0) {
				System.out.println("i = " + i);
				
				sc.close();
			}
			i++;
		}

	}

}
