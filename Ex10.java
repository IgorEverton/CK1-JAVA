package estrutura_decisao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextInt();
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextInt();
		
		if (v1 > v2) {
			System.out.printf("Maior valor: %d", v1);
		}
		else if (v1 < v2) {
			System.out.printf("O maior valor: %d", v2);
		}
		else {
			System.out.println("Os valores são idênticos");
		ler.close();
		}
	}


	}

