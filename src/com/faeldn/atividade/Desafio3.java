package com.faeldn.atividade;

import java.util.Scanner;

//3 - Sabendo que o fatorial de um valor N é: -----> n! = n x (x - 1) x (n - 2) x (n - 3) 
//x ... x 2 x 1. Crie um código que leia um valor inteiro e retorne seu fatorial e seu resultado.

public class Desafio3 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		int num;
		int x = 0;
		System.out.println ("Digite um número: ");
		num = scanner.nextInt();
		scanner.close();
		
		int result = num;
		
		for(x = 1; x < num; x++) {
			result = result * x;
			System.out.println(String.format("Seu fatorial é: %d",result));			
		}
	}
}
