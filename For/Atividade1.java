package Atividade1For;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int PrimeiroIntervalo, SegundoIntervalo,x;
		
		
		System.out.println("\nInsira o primeiro numero");
		PrimeiroIntervalo = ler.nextInt();
		System.out.println("\nInsira o Segundo numero");
		SegundoIntervalo = ler.nextInt();
		
		if(PrimeiroIntervalo >= SegundoIntervalo) {
			System.out.println("\nIntervalo invalido");
			return;
		}
		
		System.out.println("Os intervalo entre "+PrimeiroIntervalo+ " e " +SegundoIntervalo+"são:");
		for (x = PrimeiroIntervalo; x<=SegundoIntervalo; x++) {
			if(x%3==0 && x%5 ==0) {
				System.out.println(x+" é múltiplo de 3 e 5");
				
			}
		}
	}

}
