package Exercicio1POO; //Crie uma classe cliente e apresente os atributos e m�todos referentes
					  // esta classe, em seguida crie um objeto cliente, defina as instancias deste
					 // objeto e apresente as informa��es deste objeto no console.

// 1 - Crie a Classe
public class Cliente {
	
//2 - D� os atributos
	private String nome;
	private int tamanhodocalcado;
	private int numerocalca;
	private char numerocamisa;
	private int telefone;
	
//3 - Crie o Construtor e fa�a o link entre argumentos e atributos
	public Cliente (String nome, int calcado, int calca, char camisa, int tel ) 
	{
		this.nome = nome;
		tamanhodocalcado= calcado;
		numerocalca = calca;
		numerocamisa = camisa;
		telefone = tel;
	}
//4- Crie os m�todos

	public void ImprimirInfo () {
		System.out.println("Nome da(o) Cliente: "+nome+"\nTamanho do Cal�ado: "+tamanhodocalcado+"\nTamanho Cal�a: "+numerocalca+"\nTamanho da Camisa: "+numerocamisa+"\nTelefone p/ Contato: "+telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTamanhodocalcado() {
		return tamanhodocalcado;
	}

	public void setTamanhodocalcado(int tamanhodocalcado) {
		this.tamanhodocalcado = tamanhodocalcado;
	}

	public int getNumerocalca() {
		return numerocalca;
	}

	public void setNumerocalca(int numerocalca) {
		this.numerocalca = numerocalca;
	}

	public char getNumerocamisa() {
		return numerocamisa;
	}

	public void setNumerocamisa(char numerocamisa) {
		this.numerocamisa = numerocamisa;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	
}
	