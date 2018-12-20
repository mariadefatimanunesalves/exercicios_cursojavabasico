package com.mariadefatima.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
      
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua nota do 1º Bimestre: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com sua nota do 2º Bimestre: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Entre com sua nota do 3º Bimestre: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Entre com sua nota do 4º Bimestre: ");
		double nota4 = scan.nextDouble();
		
		double mediafinal = (nota1 + nota2 + nota3 + nota4) / 4;
				
		System.out.println("A média final foi: " + mediafinal);
	}

}
