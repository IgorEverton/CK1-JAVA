package estrutura_decisao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Double a, b, c;
		
		System.out.printf("Digite o lado A: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o segundo lado: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o terceiro lado: ");
		c = ler.nextDouble();
		
		if(a + b > c && a + c > b && b + c > a){
			
			if(a != b && b != c && a != c) {
				System .out.printf("Tri�ngulo Escaleno!");
			} else if (a == b && b == c) {
				System.out.printf("Tri�ngulo Equilatero!");
			} else {
				System.out.printf("Tri�ngulo Is�celes!");}
		}
			
			else {
				
				System.out.printf("N�o se formou um tri�ngulo!");
				ler.close();
		}
	}
	}


