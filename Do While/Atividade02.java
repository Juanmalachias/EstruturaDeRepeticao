package Atividade3DoWhile;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		int numb1, resultado = 0;
		double media =0;

		
		
		do {
			System.out.println("\nDigite um numero: ");
			numb1 = leia.nextInt();
			
			if (numb1 != 0 && numb1%3==0) {
				resultado += numb1;
				media++;
			}
		}while (numb1 !=0);
		
		
		if (resultado > 0) {
			media = resultado / media;	
			System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);
		}
			
	}

}
