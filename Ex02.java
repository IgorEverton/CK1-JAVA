package entrada_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		
		double a, resultado;
		
		System.out.printf("Digite um valor para calcular ao quadrado: ");
		a = Ler.nextDouble();
		
		resultado = a * a;
		
		System.out.println(resultado);
		

	}

}
