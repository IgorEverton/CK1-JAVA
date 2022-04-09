package estrutura_decisao;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double P, alt, Sx, pid;
		
		System.out.printf("Qual seu sexo(1 = Feminino, 2 = Masculino): ");
		Sx = ler.nextDouble();
		System.out.printf("Digite o seu peso: ");
		P = ler.nextDouble();
		System.out.printf("Digite sua altura: ");
		alt = ler.nextDouble();
		
		
		pid = P / (alt * alt);
		
			if (Sx == 1) {
				
				if (pid < 20) {
					System.out.printf("Abaixo do peso");}
				else if((pid >= 20) && pid < 25){
						System.out.printf("Peso ideal");}
				else{
						System.out.printf("Acima do peso");}
			}
	
				else {
					
				 	if (pid < 19) {
						System.out.printf("Abaixo do peso");
						
					}else if ((pid >= 19) && pid < 24){
						System.out.printf("Peso ideal");
					}else {
						System.out.printf("Acima do peso");
						
					 }
					
					}
			
		}
}

			
			
	


