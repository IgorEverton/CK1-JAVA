package entrada_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		
		double cdl, vdl, vcr;
		
		System.out.printf("Digite a cota��o do Dol�r atual: ");
		cdl = Ler.nextDouble();
		
		System.out.printf("Digite o valor em Dol�r: ");
		vdl = Ler.nextDouble();
		
		vcr = cdl * vdl;
				
		System.out.printf("O valor correspondente em Reais �: %2f reais", vcr);
		
	}

}
