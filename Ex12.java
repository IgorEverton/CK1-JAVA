package estrutura_decisao;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int a, b, alt;
				
				System.out.printf("Digite o valor da base: ");
				b = ler.nextInt();
				
				System.out.printf("Digite a altura: ");
				alt = ler.nextInt();
				
				a = b * alt;
				
				if (a >= 100) {
					System.out.printf("Terreno grande");
				}
				
				else {
					System.out.printf("Terreno pequeno");
				}
				ler.close();
		}
	


	}

}
