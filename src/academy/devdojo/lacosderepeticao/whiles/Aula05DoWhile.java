// Do-while vai executar pelo menos 1 vez

package academy.devdojo.lacosderepeticao.whiles;

public class Aula05DoWhile {

	public static void main(String[] args) {
		boolean condicao = false;
		while (condicao) {
			System.out.println("Dentro do while");
		}
		do {
			System.out.println("Dentro do do-while");
		} while (condicao);

	}

}
