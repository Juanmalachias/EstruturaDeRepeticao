package Atividade2Whiler;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade;
		int menor = 0;
		int  maior = 0;
		
		System.out.println("\nEnsira a idades:");
		idade = leia.nextInt();
		
		while (true) {
			System.out.println("\nEnsira a idades:");
			idade = leia.nextInt();
			if (idade < 0) {
				break;
			}
			if (idade <21) {
				menor++;
			}
			else if (idade>50) {
				maior++;
			}
			
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menor);
        System.out.println("\nTotal de pessoas maiores de 50 anos: " + maior);
	}

}
