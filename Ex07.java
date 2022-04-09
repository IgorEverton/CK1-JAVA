package entrada_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		
		int a, b, c, d, e, total, pag, troco;
		
		System.out.printf("Digite o valor do primeiro produto: ");
		a = Ler.nextInt();
		
		System.out.printf("Digite o valor do segundo produto: ");
		b = Ler.nextInt();
		System.out.printf("Digite o valor do terceiro produto: ");
		c = Ler.nextInt();
		System.out.printf("Digite o valor do quarto produto: ");
		d = Ler.nextInt();
		System.out.printf("Digite o valor do quinto produto: ");
		e = Ler.nextInt();
		System.out.printf("Digitar o valor da nota para o pagamento: ");
		pag = Ler.nextInt();
		total = a + b + c + d + e;
		
		troco = pag % total;
		
		System.out.printf("Deverá ser devolvido de troco: %d", troco);
		
	}

}
