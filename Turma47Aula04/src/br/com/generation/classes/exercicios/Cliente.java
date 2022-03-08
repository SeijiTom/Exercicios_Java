package br.com.generation.classes.exercicios;

public class Cliente {
	//atributos
	String nome;
	String login;
	String senha;
	String CPF;
	
	//métodos
	void pesquisar() {
		System.out.println("Cliente procurando o produto");
	}
	
	void guardarNoCarrinho() {
		System.out.println("Produto guardado no carrinho");
	}
	void comprar() {
		System.out.println("Cliente comprando");
	}
	void inserirDados() {
		System.out.println("Dados validados. Compra efetuada!");
	}
	
		public static void main(String[] args) {
		
			Cliente c1 = new Cliente();
			
			c1.nome = "Augusto Santos";
			c1.login = "gustinsantos@gmail.com";
			c1.senha = "7hq7a25b";
			c1.CPF = "524.478.622.06";
			
			System.out.println("Nome do cliente: " + c1.nome);
			System.out.println("Login do cliente: " + c1.login);
			System.out.println("Senha: " + c1.senha);
			System.out.println("CPF: " + c1.CPF);
			System.out.println();
			
			c1.pesquisar();
			c1.guardarNoCarrinho();
			c1.comprar();
			c1.inserirDados();
			
		}
	
}
