package academy.devdojo.estruturascondicionais.ifselse;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		double salario = 3500;
		if (salario <= 2259.20) {
			System.out.println("Isento");
		} else if (salario >= 2259.21 && salario <= 2828.65) {
			System.out.println("7.5% " + salario * 0.75);
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			System.out.println("15% " + salario * 0.15);
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			System.out.println("22.5% " + salario * 0.225);

		} else {
			System.out.println("27.5% " + salario * 0.275);
		}

	}

}
