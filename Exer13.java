package com.mariadefatima.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora: ");
        double valorHora = scan.nextDouble();
        
        System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");   
		double Horas = scan.nextDouble();
		
		double salarioBruto = valorHora * Horas;
		double inss = (salarioBruto * 100) / 8;
		double sindicato = (salarioBruto * 100) / 5;
		double ir = (salarioBruto * 100) / 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Imposto de Renda: " + ir);
		System.out.println("Total descontos: " + totalDescontos);
		System.out.println("Salário Líquido: " + salarioLiquido);


		
   }
}
