/* 
 * Eu, como administrador do sistema, gostaria de permitir que os próprios usuários cadastrassem
 * o nome de usuário (login) no sistema para garantir o processo de migração do sistema antigo para
 * o novo.
 * O usuário não pode deixar o login vazio "", ou criar um usuário com o login "admin" ou 
 * "administrador".
 * Se o valor for válido, o sistema deverá exibir uma mensagem <nome do usuário> cadastrado com sucesso.
 * Senão o sistema deverá mostrar "Usuário inválido".
 */

package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CadastroDeLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome de usuário: ");
		String nome = sc.next();
		if (nome.isEmpty() || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador"))  {
			System.out.println("Usuário Inválido");
		} else {
			System.out.println("Nome do usuário " + nome + " cadastrado com sucesso");
		}
		
		sc.close();
	}

}
