package Atividade1For;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int x,número,valorPares = 0,valorImpares = 0;
		
		for(x=1;x<=10;x++) {
			System.out.println("Digite um numero: ");
			número = ler.nextInt();
			System.out.println("\nDigite o "+x+" é :" +número);
		if (número % 2 ==0) {
			valorPares++;
				} 
		else {
			valorImpares++;
				}
		
		}
		System.out.println("Total de numero pares são: "+valorPares);
		System.out.println("Total de numero pares são: "+valorImpares);


		
		
		
	}

}
