package com.mariadefatima.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
      
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua nota do 1� Bimestre: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com sua nota do 2� Bimestre: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Entre com sua nota do 3� Bimestre: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Entre com sua nota do 4� Bimestre: ");
		double nota4 = scan.nextDouble();
		
		double mediafinal = (nota1 + nota2 + nota3 + nota4) / 4;
				
		System.out.println("A m�dia final foi: " + mediafinal);
	}

}
