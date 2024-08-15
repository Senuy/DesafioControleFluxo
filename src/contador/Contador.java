package contador;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro paramêtro: ");
		int parametro1 = terminal.nextInt();

		System.out.println("Digite o segundo paramêtro: ");
		int parametro2 = terminal.nextInt();
	
		try {
			contar(parametro1, parametro2);
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void contar(int parametro1, int parametro2)throws ParametrosInvalidosException{
		int contagem;
		if (parametro2 > parametro1) {
			 contagem = parametro2-parametro1;
		} else {
			throw new ParametrosInvalidosException("O segundo parametro dever ser maior que o primeiro");
		}
		for(int i = 0; i<=contagem ; i++ ) {
			System.out.println("Imprimindo números da contagem: "+ i );
		}
	}
}


