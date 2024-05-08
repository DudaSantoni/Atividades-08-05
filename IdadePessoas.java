package estruturaPosCondicionada;

import java.util.Scanner;

public class IdadePessoas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i = 1;
		int idade, soma=0; 

		while(i < 20) {
			System.out.println("Informe a idade");
			idade = ler.nextInt();
			i++;

			if(idade >= 18) {
				soma++;
			}

		}

		System.out.println("O número de pessoas maiores de idade é: " + soma);

		ler.close();
	}



}


