/*
 * Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes
 * parâmetros para que eu possa agilizar o processo de cadastramento:
 * Sexo, sendo válido apenas M ou F e idade.
 * Se o sexo for Masculino, e a idade for maior ou igual a 18 os sitema deverá imprimir, 
 * alistamento obrigatório.
 * Se o sexo for Masculino e a idade for menor que 18 o sistema deverá imprimir, alistamento não 
 * permitido.
 * Se o sexo for Feminino e a idade for maior que 18 o sistema deverá perguntar se a pessoas
 * deseja se alistar.
 * Se o sexo for Feminino e a idade for menor que 18 o sistema deverá imprimir, alistamento 
 * não permitido.
 */

package academy.devdojo.estruturascondicionais.ifselse;

public class AlistamentoMilitar {

	public static void main(String[] args) {
		char sexo = 'F';
		int idade = 18;
		if (sexo == 'M' && idade >= 18) {
			System.out.println("Alistamento obrigatório");
		} else if (sexo == 'M' && idade < 18 || sexo == 'F' && idade < 18) {
			System.out.println("Alistamento não permitido");
		} else if (sexo == 'F' && idade >= 18) {
			System.out.println("Deseja se alistar? ");
		}

	}

}
