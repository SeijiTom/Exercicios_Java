package br.com.generation.repeticao03;

public class ExemploFor {

	public static void main(String[] args) throws InterruptedException {
	//	throws InterruptedException avisa ao processador que se algo
	// der errado at� o programa chegar na Thread, abortar miss�o!
		for(int i = 0; i <= 10; i++) {
			System.out.println( i );
			Thread.sleep(500); //esse cara ta conversando com o processador
		//As Threads que determinam o tempo de carregamento das coisas
		//Seja a inicializa��o dos programas de um SO, seja um la�o no Java
		}

	}

}
