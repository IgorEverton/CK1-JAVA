package estrutura_decisao;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, alt;
		
		System.out.printf("Digite o valor da base: ");
		b = ler.nextInt();
		
		System.out.printf("Digite a altura: ");
		alt = ler.nextInt();
		
		a = b * alt;
		
		if (a >= 100) {
			System.out.printf("Terreno grande");
		}

System.out.printf("A área do retângulo é: %d", a);		
ler.close();
	}

}
