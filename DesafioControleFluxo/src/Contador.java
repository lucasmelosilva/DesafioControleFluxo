import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = lerNumero(sc) ;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = lerNumero(sc);
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
			System.out.println("Error: " + exception.getMessage());
		}
		
	}
	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		} else {
			int contagem = parametroDois  - parametroUm;
			for (int i = 1; i <= contagem; i++) {
				System.out.printf("Imprimindo número %d\n1", i);
			}
		}
	}

	public static int lerNumero (Scanner scanner) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Entre com um número válido");
			}
		}
	}
}