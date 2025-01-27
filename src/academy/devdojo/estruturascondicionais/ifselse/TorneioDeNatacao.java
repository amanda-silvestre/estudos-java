/* 
 * Eu como usuario gostaria de ter o nome e a idade de participantes de um torneio de natação 
 * e que o sistema imprimisse da seguinte forma:
 * Menor de 10 anos: <Nome> participara da categoria Infantil
 * Entre 11 e 15 anos: <Nome> participara da categoria Juvenil
 * Entre 16 e 19 anos: <Nome> participara da categoria Pré-Adulto
 * Acima de 20 anos: <Nome> participara da categoria Adulto
 * Para que eu possa rapidamente classificar todos os participantes
 */

package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class TorneioDeNatacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		if (idade <= 10) {
			System.out.println(nome + " Infantil");
		} else if (idade >= 11 && idade <= 15) {
			System.out.println(nome + " Juvenil");
		} else if (idade >= 16 && idade <= 19) {
			System.out.println(nome + " Pré-adulto");
		} else {
			System.out.println(nome + " Adulto");
		}
		
		sc.close();
	}

}
