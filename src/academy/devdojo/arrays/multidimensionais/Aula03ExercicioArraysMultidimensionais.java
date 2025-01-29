// Calcule a multiplicação dos elementos da diagonal principal de uma matriz quadrada

package academy.devdojo.arrays.multidimensionais;

public class Aula03ExercicioArraysMultidimensionais {

	public static void main(String[] args) {
		int[][] arrayMulti1 = new int[3][3];
		arrayMulti1[0][0] = 22;
		arrayMulti1[0][1] = 11;
		arrayMulti1[0][2] = 4;
		arrayMulti1[1][0] = 44;
		arrayMulti1[1][1] = 55;
		arrayMulti1[1][2] = 9;
		arrayMulti1[2][0] = 2;
		arrayMulti1[2][1] = 5;
		arrayMulti1[2][2] = 21;
		int resultMultDiagonalPrincipal = 1;
		for (int i = 0; i < arrayMulti1.length; i++) {
			for (int j = 0; j < arrayMulti1[i].length; j++) {
				if(i==j) {
					resultMultDiagonalPrincipal = resultMultDiagonalPrincipal * arrayMulti1[i][j];
				}
			}
		}
		System.out.println(resultMultDiagonalPrincipal);
	}

}
