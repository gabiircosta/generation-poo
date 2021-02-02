package Exercicio1POO;

import java.text.NumberFormat;

public class Aviao {
	private int numerovoo;
	private String nomecompanhia;
	private double preco;
	private String nomecliente;
	private String sobrenomecliente;
	
	public Aviao (int nvoo, String companhia, double preco, String nomecliente, String sobrenomecliente)
	{
		numerovoo = nvoo;
		nomecompanhia = companhia;
		this.preco = preco;
		this.nomecliente = nomecliente;
		this.sobrenomecliente = sobrenomecliente;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}
	
	public void descontopassagem (double percentual)
	{
		preco = preco - (preco*percentual);
	}
	
	public void ImprimirInfo () 
	{
		System.out.println("Dados de Voo\n*******\nNome da(o) Passageira(o): "+nomecliente+" "+sobrenomecliente+"\nNúmero do Voo: "+numerovoo+"\nCompanhia: "+nomecompanhia+"\nPreço Original da Passagem: "+this.formatarMoeda());
	}
	
	public void ImprimirInfo2 () 
	{
		System.out.println("**ATENÇÃO**\nSr.(a) "+nomecliente+" "+sobrenomecliente+", você recebeu um desconto e vai pagar "+this.formatarMoeda()+" na sua passagem!");
	}

}
