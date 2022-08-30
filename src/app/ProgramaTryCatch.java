package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaTryCatch {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entre com os nomes para o vetor: ");
			String[] vetor = sc.nextLine().split(" ");
			
			System.out.println("Entre com a posição do elemento: ");
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
		} 
		catch (InputMismatchException e) {
			System.out.println("Tipo de valor inválido!");
		}
		
		System.out.println("Fim do programa!");
				
		
		sc.close();
	}

}
