package br.com.generation.projeto01;

import java.util.Scanner;

public class SugestoesViagem {

	public void SugerirViagem() {
	
	Scanner leia = new Scanner(System.in);

	String pergunta1 = " ";
	String pergunta2 = " ";
	String pergunta3 = " ";
	String pergunta4 = " ";
	char simOuNao;
	
	
	

	System.out.println();
	System.out.println("Agora nosso site ir� fazer algumas perguntas para determinar o melhor destino de viagem!");
	System.out.println();
	System.out.println("Voc� vai viajar em :" + 
	"\nA - Fam�lia;" + 
	"\nB - Casal;" + 
	"\nC - Sozinha;" +
	"\nDigite a letra correspondente:");
	pergunta1 = leia.next();

	System.out.println("\nVoc� procura um lugar para :" + 
	"\nA - Relaxar;" + 
	"\nB - Curtir;" + 
	"\nC - Trabalho" +
	"\nDigite a letra correspondente:");
	pergunta2 = leia.next();

	System.out.println("\nVoc� prefere :" + 
	"\nA - Calor;" + 
	"\nB - Frio;" + 
	"\nC - Clima Ameno" +
	"\nDigite a letra correspondente:");
	pergunta3 = leia.next();

	System.out.println("\nVoc� busca por :" + 
	"\nA - Uma boa balada;" + 
	"\nB - Um bom roteiro gastron�mico;" +
	"\nC - Uma rotina cheia de aventuras" + 
	"\nDigite a letra correspondente:");
	pergunta4 = leia.next();


	String conjunto = (pergunta1 + pergunta2 + pergunta3 + pergunta4);

	//System.out.println(conjunto);

	System.out.println();
	switch (conjunto){
		case"BABB":
			System.out.println("Com base nas suas respostas" +
				" o destino indicado �: Monte Verde - MG");
	break;
		case"CBAA":
			System.out.println("Com base nas suas respostas" +
				 " os destinos indicados s�o: Porto Seguro - BA" +
				 " e Praia de Copacabana - RJ");
	break;
		case"AAAC":
			System.out.println("Com base nas suas respostas" +
				" os destinos indicados s�o: Praia do Espelho - Trancoso - BA" +
				" e Praia do Forte - Mata de S�o Jo�o - BA");
	break;
		case"BBCB":
			System.out.println("Com base nas suas respostas" +
				" o destino indicado �: S�o Roque - SP");
	break;
		case"ABCC":
			System.out.println("Com base nas suas respostas" +
				" os destinos indicados s�o: Brotas - SP" +
				" e Ol�mpia - SP"	);
	break;
		case"CABC":
			System.out.println("Com base nas suas respostas" +
				" os destinos indicados s�o: Pico dos Tr�s Estados - MG" +
				" e Pico das agulhas Negras - RJ");	
	break;
		case"ACAC":
			System.out.println("Com base nas suas respostas" +
				" o destino indicado �: �guas de S�o Pedro - SP");	
	break;
		case"BAAC":
			System.out.println("Com base nas suas respostas" +
				" o destino indicado �: Porto de Galinhas - PE");	
	break;
		case"CCAB":
			System.out.println("Com base nas suas respostas" +
				" o destino indicado �: Ouro Preto - MG");	
	break;
		case"AABC":
			System.out.println("Com base nas suas respostas" +
				" os destinos indicados s�o: Serra Negra - SP" +
				" e Curitiba - PR");	
	break;
	default: System.out.println("Com base nas suas respostas" +
			" o destino indicado �: Corn�lio Proc�pio - PR");
	}
	System.out.println();
	System.out.println("Voc� gostaria de ver as op��es de estadia? Digite 's' ou 'n': ");
	simOuNao = leia.next().charAt(0);
	
	while(simOuNao != 's' && simOuNao != 'n') {
		System.out.println("Valor digitado inv�lido! Por favor digite 's' para");
		System.out.println("prosseguir ou 'n' para finalizar o programa...");	
		simOuNao = leia.next().charAt(0);
	}
	if(simOuNao == 's') {
		System.out.println("Ent�o vamos l�!");
	}
	else if(simOuNao == 'n') {
		System.out.println("Opera��o encerrada!");
		System.exit(0);
	}
	leia.close();
}
}
