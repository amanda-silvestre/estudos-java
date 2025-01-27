/*
 * Dado um determinado salário
 * Se o salário for maior que 4500, imprima 30% do valor
 * Senão imprima 15% do valor
 * Desafio: Utilize apenas uma variável para guardar o resultado e imprimir no final
 * Desafio 2: Diga na impressão se é 30% ou 15%.
 */

package academy.devdojo.estruturascondicionais.ifselse;

public class CalculadoraImpostoComCondicional2 {

	public static void main(String[] args) {
		double salario = 4300;
		double porcentagem = 0.0;
		if (salario > 4500) {
			double trintaPorCento = salario * 0.3;
			porcentagem = 0.3;
		//	System.out.println("30% é = " + trintaPorCento);
		} else {
			double quinzePorCento = salario * 0.15;
			porcentagem = 0.15;
		//	System.out.println("15% é = " + quinzePorCento);
		}
		System.out.println("A porcentagem é de " + porcentagem + " e o salario é " + salario);
	}

}
