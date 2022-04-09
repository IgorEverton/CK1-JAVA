package estrutura_decisao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, v0, t, VF;
		
		System.out.printf("Digite o valor da a aceleração: ");
		a = ler.nextDouble();
		System.out.printf("Digite o valor da velocidade inicial:");
		v0 = ler.nextDouble();
		System.out.printf("Digite o tempo do percurso: ");
		t = ler.nextDouble();
		
		VF = v0 + a * t;
		
		if (VF <= 40) {
			System.out.printf("Velocide %2f. Veículo muito lento");}
			else if (40 < VF && VF<= 40){
			System.out.printf("Velocide %2f. Velocidade permitda");}
			else if(VF > 60 && VF <= 80) {
			System.out.printf("Velocide %2f. Velocidade de cruzeiro", VF);}
			else if(VF > 80 && VF <= 120) {
			System.out.printf("Velocide %2f. Veículo rápido", VF);} 
			else if(VF > 120 ) {
			System.out.printf("Velocide %2f.Veículo muito rápido", VF);}
	
		ler.close();
				
			}
		}
		
		




