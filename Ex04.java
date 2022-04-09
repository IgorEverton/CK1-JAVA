package entrada_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		
		double a, b, c, d, media;
		
		System.out.printf("Digite o primeiro valor: ");
		a = Ler.nextDouble();
		System.out.printf("Digite o segundo valor: ");
		b = Ler.nextDouble();
		System.out.printf("Digite o terceiro valor: ");
		c = Ler.nextDouble();
		System.out.printf("Digite o quarto valo: ");
		d = Ler.nextDouble();
		
		media = a + b + c + d / 4;
		
		System.out.printf("A média dos valores é %2f", media);
	}

}
