package entrada_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		 
		 double celsius, fahr;
		 
		 System.out.printf("Digite a temperatura para ser convertidade: ");
		 celsius = Ler.nextDouble();
		 
		 fahr = celsius * 1.8 + 32;
		 
		 System.out.printf("O equivalente da temperatura em Fahrenheit é: %2f", fahr);
	}

}
