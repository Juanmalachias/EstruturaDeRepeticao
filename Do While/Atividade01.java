package Atividade3DoWhile;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numb1,resultado =0;
		
		
		
		do {
			System.out.println("\nDigite um número: ");
			numb1 = leia.nextInt();
			
			if(numb1 > 0) {
				resultado+=numb1;
			}
		}while (numb1 !=0);
		
		 System.out.println("\nA soma dos números positivos é: " + resultado);
		 
		
		
		
	}

}
