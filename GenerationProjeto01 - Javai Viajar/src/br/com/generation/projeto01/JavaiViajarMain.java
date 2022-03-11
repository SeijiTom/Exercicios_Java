package br.com.generation.projeto01;

import java.util.ArrayList;
import java.util.Scanner;


public class JavaiViajarMain extends SugestoesViagem{

	public static void main(String[] args) throws InterruptedException {
		
		Scanner entrada = new Scanner(System.in);
		
		String loginCriado;
		String senhaCriada;
		String login;
		String senha;
		char possuiContaOuNao;
		
		
		Thread.sleep(500);
		System.out.println("====================================================");
		Thread.sleep(500);
        System.out.println("=              N�o sabe para onde ir?              =");
        Thread.sleep(500);
		System.out.println("=              JAVAi Viajar te ajuda!              =");
		Thread.sleep(500);
		System.out.println("=                                                  =");
		Thread.sleep(500);
		System.out.println("=                                                  =");
		Thread.sleep(500);
		System.out.println("=  Ol�, bem vindo a JAVAi Viajar, o melhor e mais  =");
		Thread.sleep(500);
		System.out.println("=  econ�mico site de viagens!                      =");
		Thread.sleep(500);
		System.out.println("=                                                  =");
		Thread.sleep(500);
		System.out.println("=  Voc� j� possui uma conta?                       =");
		Thread.sleep(500);
		System.out.println("=                                                  =");
		Thread.sleep(500);
		System.out.println("=  Se sim, por favor digite 's' sen�o  digite 'n'  =");
		Thread.sleep(500);
		System.out.println("=  para criar sua conta.                           =");
		Thread.sleep(500);
		System.out.println("====================================================");
		
		possuiContaOuNao = entrada.next().charAt(0);
		
		while(possuiContaOuNao != 's' && possuiContaOuNao != 'n') {
			System.out.println("Valor digitado inv�lido! Por favor digite 's' se");
			System.out.println("possuir uma conta ou 'n' caso n�o possua...");	
			possuiContaOuNao = entrada.next().charAt(0);
		}
		
		if(possuiContaOuNao == 's') {
			System.out.println("==================");
			System.out.println("=     SING IN    =");
			System.out.println("==================");
			System.out.println();
			System.out.println("Digite seu login: ");
			login = entrada.next();
			System.out.println("Digite sua senha: ");
			senha = entrada.next();
			
			while(!login.equals("thiago.tomita2@gmail.com") || !senha.equals("123")) {
				System.out.println("Login ou senha inv�lido! Tente novamente...");
				System.out.println();
				System.out.println("Digite seu login: ");
				login = entrada.next();
				System.out.println("Digite sua senha: ");
				senha = entrada.next();
				
			}
			if (login.equals("thiago.tomita2@gmail.com") && senha.equals("123")) {
				System.out.println("Bem vindo Thiago Tomita!");
			}
			
		}
		else if(possuiContaOuNao == 'n') {
			System.out.println("==================");
			System.out.println("=     SING UP    =");
			System.out.println("==================");
			System.out.println();
			System.out.println("Crie seu login: ");
			loginCriado = entrada.next();
			System.out.println("Crie sua senha: ");
			senhaCriada = entrada.next();
			System.out.println();
			System.out.println("-------------------------");
			System.out.println("Bem vindo " + loginCriado + "!");
			System.out.println("-------------------------");
		}
		
		SugestoesViagem sugestoes = new SugestoesViagem();
		
		sugestoes.SugerirViagem();
		
		Hospedarias h1 = new Hospedarias("1 - Pousada Esmeralda", 352);
		Hospedarias h2 = new Hospedarias("2 - Pousada Frio da Montanha", 251);
		Hospedarias h3 = new Hospedarias("3 - Pousada da Serra", 197);
		Hospedarias h4 = new Hospedarias("4 - Pousada Pedra Redonda", 500);
		
		ArrayList<Hospedarias> hospedarias = new ArrayList<>();
		
		hospedarias.add(h1);
		hospedarias.add(h2);
		hospedarias.add(h3);
		hospedarias.add(h4);
		
		System.out.println();
		System.out.println("Veja as op��es de hospedaria: ");
		System.out.println(hospedarias);
		
		System.out.println();
		System.out.println("Opera��o encerrada.");
		System.out.println("Obrigado por usar JAVAi Viajar. Volte sempre!");
		
		entrada.close();
	}
}
