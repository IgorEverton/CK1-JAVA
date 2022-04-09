package estrutura_decisao;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p, alt, pid;
		
		System.out.printf("Digite seu peso: ");
		p = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		alt = ler.nextDouble();
		
		pid = p / (alt * alt);
		
		if (pid >= 20 && pid <= 25) {
			System.out.println("Peso ideal");
			}
		else {
			System.out.println("Fora do peso ideal");
		ler.close();
			
		}
	}

}
