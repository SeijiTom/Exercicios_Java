package br.com.generation.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 { //inicio da classe ou do programa

	public static void main(String[] args) { //fun��o inicio / start
		
		Locale.setDefault(Locale.US); //se quiser trabalhar com . no console pois agora est� no padr�o americano, se o SO j� estiver em ingl�s isso pode gerar conflitos pois padr�o j� ser� .
		
		Scanner leia = new Scanner(System.in); // classe importada da biblioteca util
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: "); // classe que j� est� integrada, n�o precisando importat nenhuma biblioteca
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 7 && media <= 10) {
			System.out.println("Aprovado! Sua m�dia foi de: " + media);
		}
		
		else if(media >= 3 && media < 7) {
			System.out.println("Recupera��o! Sua m�dia foi de: " + media);
		}
		
		else if(media == 0 && media < 3) {
			System.out.println("Reprovado! Sua m�dia foi de: " + media);
		}
		
		else {
			System.out.println("Valores inv�lidos!");
		}
		
		leia.close();
	}

}
