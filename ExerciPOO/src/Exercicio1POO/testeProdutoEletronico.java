package Exercicio1POO;

//1 - Crie a Classe
public class testeProdutoEletronico {

//2- Crie o main
	public static void main (String args [])
	{
		
		System.out.println("Obrigada por escolher a Gabi's Conserta Tudo!\nSiga abaixo suas informa��s:\n");
//3- Instancie seu objeto
		
		ProdutoEletronico PE = new ProdutoEletronico ("Celular", "Apple", "iPhone 6S", "Space Gray",4.7);
//4- Chame seu m�todo
		PE.ImprimirInfo();
		
		System.out.println("Obrigada pela prefer�ncia!");
	}
}
