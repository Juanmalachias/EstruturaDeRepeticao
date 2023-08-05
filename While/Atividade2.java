package Atividade2Whiler;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, categoria;
		int Backend = 0, Frontend = 0, Mobile = 0, FullStack =0;
		char Continuar;
		
		while(true) {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("\nDigite seu sexo: 1 - masculino ou 2 ferminio");
			sexo = leia.nextInt();
			System.out.println("\n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack\nDigite sua categoria: ");
			categoria = leia.nextInt();
			
			if (categoria ==1) {
				Backend++;
			}else if (categoria == 2 && sexo == 2) {
				Frontend++;
			}else if (categoria ==3 && sexo == 1 && idade >40) {
				Mobile++;
			}else if(categoria == 4 && sexo == 2 && idade < 30){
				FullStack++;
			}
			System.out.println("Deseja continuar? (S/N)");
			Continuar = leia.next().charAt(0);
			
			if(Continuar == 'N' ||Continuar == 'n' ) {
				break;
			}
			
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + Backend);
        System.out.println("Total de mulheres desenvolvedoras Frontend: " + Frontend);
        System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + Mobile);
        System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + FullStack);
		
        
        leia.close();
		
		
	}

}
