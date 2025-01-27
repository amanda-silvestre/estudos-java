/*
 * Dado um determinado salário
 * Se o salário for maior que 4500, imprima 30% do valor
 * Senão imprima 15% do valor
 * Desafio: Utilize apenas uma variável para guardar o resultado e imprimir no final
 * Desafio 2: Diga na impressão se é 30% ou 15%.
 */

package academy.devdojo.estruturascondicionais.ifselse;

public class CalculadoraImpostoComCondicional {

	public static void main(String[] args) {
		double salario = 4400;
		double resultado = 0.0;
		String porcentagem = "";
		if (salario > 4500) {
			resultado = salario * 0.3;
		porcentagem = "30%"; 
		} else {
			resultado = salario * 0.15;
		porcentagem = "15%";
		}
		System.out.println("O valor final em porcentagem de " + porcentagem + " é de " + resultado);

	}

}
