package br.com.generation.exercicios2;

import java.util.ArrayList;

public class TestaEstoqueLoja {

	public static void main(String[] args) {
		
		EstoqueLoja p1 = new EstoqueLoja("Sabão em pó", 90);
		EstoqueLoja p2 = new EstoqueLoja("Detergente líquido", 45);
		EstoqueLoja p3 = new EstoqueLoja("Coco-cola", 70);
		EstoqueLoja p4 = new EstoqueLoja("Arroz", 100);
		
		ArrayList<EstoqueLoja> produtos = new ArrayList<>();
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		
		System.out.println(produtos);

	}

}
