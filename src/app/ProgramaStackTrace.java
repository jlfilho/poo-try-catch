package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaStackTrace {

	public static void main(String[] args) {
		metodo1();
		System.out.println("Fim do programa!");

	}
	
	public static void metodo1() {
		System.out.println("*** INÍCIO DO MÉTODO1 ***");
		metodo2();
		System.out.println("*** FIM DO MÉTODO1 ***");
	}

	public static void metodo2() {
		System.out.println("*** INÍCIO DO MÉTODO2 ***");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Entre com os nomes para o vetor: ");
			String[] vetor = sc.nextLine().split(" ");

			System.out.println("Entre com a posição do elemento: ");
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Tipo de valor inválido!");
		} 
		sc.close();
		System.out.println("*** FIM DO MÉTODO2 ***");
	}

}
