package com.faeldn.atividade;

import java.util.Scanner;

public class Desafio1 {
	
	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	int num;
	System.out.println ("Digite um n�mero: ");
	num = scanner.nextInt();
	scanner.close();
	if (num % 2 == 0){
		System.out.println (String.format ("O n�mero %d � par.", num));
	} else
		System.out.println (String.format ("O n�mero %d � impar.", num));
	}
}