package Exercicio1POO;

public class testeAviao {

	public static void main (String Args []) {
		
	Aviao avi1 = new Aviao (0221,"Azul",100,"Gabriela","Rodrigues");
	avi1.ImprimirInfo();
	System.out.println("*******");
	
	avi1.descontopassagem(0.15);
	avi1.ImprimirInfo2();


	}
	
}
