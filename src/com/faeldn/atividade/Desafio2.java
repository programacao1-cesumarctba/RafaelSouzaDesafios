package com.faeldn.atividade;

import java.util.Scanner;

//2 - Dado um valor inteiro N, verifique as seguintes condições: . 
//Se N for impar, exiba "Estranho" . Se N for par e for menor que 10, exiba "Não é estranho" . 
//Se N for par e estiver entre 10 e 20, exiba "Estranho" . 
//Se N for par e for maior que 20, exiba "Não é estranho"

public class Desafio2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		int num;
		System.out.println ("Digite um número: ");
		num = scanner.nextInt();
		scanner.close();
		if ((num % 2 == 0) && (num <10)) {
			System.out.println (String.format ("O número %d não é estranho e é menor que 10.", num));
		}
		else if ((num % 2 == 0) && (num > 10) && (num <20)) {
			System.out.println (String.format ("O número %d é estranho e está entre 10 e 20.", num));
		}
		else if ((num % 2 == 0) && (num > 20)) {
			System.out.println (String.format ("O número %d não é estranho e é maior que 20.", num));
		}
		else if (num % 2 !=0 ) {
			System.out.println (String.format("O número %d é estranho e é ímpar.", num));
			}
	}
}	