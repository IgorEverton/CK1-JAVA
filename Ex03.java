package entrada_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int base, altura, resultado;
		
		System.out.printf("Digite o valor da base: ");
		base = ler.nextInt();
		
		System.out.printf("Digite o valor da altura: ");
		altura = ler.nextInt();
		
		resultado = base * altura / 2;
		
		System.out.printf("A área do triangulo é de: %d", resultado);
	}

}
