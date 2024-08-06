
		// tarefa ebac calculo média de 4 notas e controle de fluxos

	package Ifelse;

	import java.util.Scanner;

	public class Tarefamodulo10ifandelse {
		
		public static void main (String []args) {
		
			
		
			Scanner scan = new Scanner (System.in);
			
			
			System.out.println("Escreva a primeira nota:");
			double nota1 = scan.nextDouble();
			
			System.out.println("Escreva a segunda nota:");
			double nota2 = scan.nextDouble();
					
			System.out.println("Escreva a terceira nota:");
			double nota3 = scan.nextDouble();
			
			System.out.println("Escreva a quarta nota:");
			double nota4 = scan.nextDouble();
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			if (media >= 70) {
				System.out.println("O aluno está aprovado!");}
			
			  else
				
				if (media >= 50) {
				 System.out.println("O aluno está de recuperação.");}
				
				 else
					 
					 if(media <= 50) {
						 System.out.println("O aluno está reprovado!");
				 
				 
				
				}
			}
			
			
			
			
			
			
	}
	


