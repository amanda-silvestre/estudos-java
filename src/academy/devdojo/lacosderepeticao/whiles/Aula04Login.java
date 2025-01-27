/*
 * Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e
	senha corretos devem estar armazenados em constantes no seu programa. Se o
	usuário acertar o usuário e a senha exibir a mensagem ACESSO CONCEDIDO, caso
	contrário exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha,
	essa condição deve-se repetir até que o usuário acerte a combinação.
 */

package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04Login {

	public static void main(String[] args) {
		final String login = "Luffy";
		final String password = "ReiDosPiratas";
		boolean exibirTelaLogin = true; {
		Scanner sc = new Scanner(System.in);
		
		while (exibirTelaLogin) {
			System.out.println("Digite seu login");
			String loginDigitado = sc.nextLine();
			System.out.println("Digite sua senha");
			String passwordDigitado = sc.nextLine();
			if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
				System.out.println("ACESSO CONCEDIDO");
				exibirTelaLogin = false;
			} else {
				System.out.println("ACESSO NEGADO");
			}
			System.out.println("PROGRAMA TERMINADO");
		}		
		
		}
	
	}

}
