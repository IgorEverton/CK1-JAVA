package estrutura_decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double A, B, hip;
	
	System.out.printf("Digite o valor do primeiro cateto: ");
	A = ler.nextDouble();
	System.out.printf("Digite o valor do segundo cateto: ");
	B = ler.nextDouble();
	System.out.printf("Digite o valor da hipotenusa: ");
	hip = ler.nextDouble();
	if (A * A + B * B == hip * hip) {
		System.out.printf("� um tri�ngulo ret�ngulo");
	}
	else {
		System.out.println("N�o � um tri�ngulo ret�ngulo");
		
	ler.close();	
	}

	}

}
