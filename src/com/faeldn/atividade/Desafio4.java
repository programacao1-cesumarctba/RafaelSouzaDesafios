package com.faeldn.atividade;

import java.util.Scanner;

//4 - Crie um programa que receba um valor numerico inteiro N, 
//e calcule a tabuada completa desse numero de 1 até 10. 
//Imprimindo linha a linha da tabuada. 2 x 1 = 2 2 x 2 = 4 2 x 3 = 6...

public class Desafio4 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		int i;
		int num;
		int mult;
		System.out.println ("Digite um número: ");
		num = scanner.nextInt();
		scanner.close();
		
		for (i=1; i<11; i++) {
			mult = num * i;
			System.out.println(String.format("%d X %d = %d",num, i, mult));
		}
	}
}
