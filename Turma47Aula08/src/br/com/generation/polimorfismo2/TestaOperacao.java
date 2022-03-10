package br.com.generation.polimorfismo2;

import java.util.Scanner;

public class TestaOperacao {
	
	static double num1, num2; //o "static" diz pra nos que essa variaveis e esses metodos só podem ser usados nesta classe
	//por herança vc pode usar nas subclasses tbm msm se na superior estiver "static".
	
	public static void calculaOperacao(OperacaoMatematica op, double x, double y) {// static void por que ele não retorna
		System.out.println(op.calcular(x,y));//->objeto op recebe metodo calcular que recebe parametros x e y
	}

	public static void main(String[] args) {
	
		scan();
		calculaOperacao(new Soma(), num1, num2);
		calculaOperacao(new Multiplicacao(), num1, num2);
		
	}
	
	public static void scan() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o 1° número: ");
		num1 = entrada.nextDouble();
		System.out.println("Entre com o 2° número: ");
		num2 = entrada.nextDouble();
		entrada.close();
	}

}
