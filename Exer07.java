package com.mariadefatima.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		//area = lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println("A �rea do quadrado �: " + area);
		System.out.println("O dobro da �rea do quadrado �: " + (area * 2));
	}

}
