package com.mariadefatima.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
     
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		int num2 = scan.nextInt();
		
		int resultado = num1 + num2;
		System.out.println("O resultado final �: " + resultado);
	}

}
