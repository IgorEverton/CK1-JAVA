package estrutura_decisao;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		double p1, md, p2;
		
		System.out.printf("Digite a nota da primeira prova: ");
		p1 = ler.nextDouble();
		
		md = 5;
		
		p2 = (3 * md - p1 ) / 2;
		
		System.out.printf("Você precisa tirar %1f", p2);
				
				

	}
}