package estruturaPosCondicionada;

import java.util.Scanner;

public class NumerosDosUsuarios {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i = 1;
		int num=0, soma=0; 

		while(i <= 10) {
			System.out.println("Informe um número");
			num = ler.nextInt();
			i++;
			soma=soma+num;
		}


		System.out.println("A soma dos números é: " + soma);

		ler.close();


	}

}
