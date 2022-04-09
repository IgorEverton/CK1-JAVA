package entrada_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);

		double a, b, resultado;
		
		System.out.printf("Digite o primeiro valor: ");
		a = Ler.nextDouble();
			
		System.out.printf("Digite o segunto valor: ");
		b = Ler.nextDouble();
		
		resultado = a * b;
		
		System.out.printf("A área é de: %2f", resultado);
	}

}
