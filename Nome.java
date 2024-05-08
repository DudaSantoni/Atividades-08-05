package estruturaPosCondicionada;

import java.util.Scanner;

public class Nome {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome;
		int i = 0;

		System.out.println("Informe seu nome");
		nome = ler.nextLine();

		while(i < 10) {

			System.out.println(nome);

			i++;
		}
		
		ler.close();
	
	}

}
