package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03ExercicioArraysMelhorado {

	public static void main(String[] args) {
		int[] array1 = new int[3];
		int[] array2 = new int[3];
		int[] array3 = new int[3];
		Scanner sc = new Scanner(System.in);
		String resultadoMultiplicadoArrays = "";
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Vetor 1, posição " + i + ": ");
			array1[i] = sc.nextInt();
			System.out.println("Vetor 2, posição " + i + ": ");
			array2[i] = sc.nextInt();
			array3[i] = array1[i] * array2[i];
			resultadoMultiplicadoArrays = resultadoMultiplicadoArrays + array3[i] + " ";
		}
		System.out.println(resultadoMultiplicadoArrays);

	}

}
