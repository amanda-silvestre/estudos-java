package academy.devdojo.arrays.unidimensional;

public class Aula01Introducao {

	public static void main(String[] args) {
		double nota1 = 7.5;
		double nota2 = 8.0;
		double nota3 = 3;
		double nota4 = 6;
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println(media);
		double[] notas = new double[4];
		
		System.out.println("-----------------");
		
		notas[0] = 7.5;
		notas[1] = 8.0;
		notas[2] = 3;
		notas[3] = 6;
		
		System.out.println("Tamanho do arrays: " + notas.length);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}

}
