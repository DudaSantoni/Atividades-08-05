package estruturaPosCondicionada;

import java.util.Scanner;

public class NNumeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i = 0, numero;

		System.out.println("Digite o número");
		numero = ler.nextInt();
		System.out.println("Digite o seu nome");
		String nome = ler.next();

		while(i < numero) {
			i++;
			System.out.println(nome);
		}

		ler.close();

	}

}
