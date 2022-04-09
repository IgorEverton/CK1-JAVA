package estrutura_decisao;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextInt();
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextInt();
		
		if (v1 < v2) {
			System.out.printf("O valor %d é o menor", v1);
		}
		else {
			System.out.printf("O valor %d é o menor", v2);
		ler.close();
		}
	}

	}

