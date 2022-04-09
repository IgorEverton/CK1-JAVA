package estrutura_decisao;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, md;
		
		System.out.printf("Digite a nota da primeira prova: ");
		p1 = ler.nextDouble();
		System.out.printf("Digite a nota da segunda prova: ");
		p2 = ler.nextDouble();
		
		md = (p1 + (p2 * 2)) / 3;
		
		if(md>=5) {
			System.out.printf("Sua nota média %1f, você está APROVADO", md);}
		else {
			System.out.printf("Sua nota média %1f, você está REPROVADO", md);}
			
		}
				
				

	}


