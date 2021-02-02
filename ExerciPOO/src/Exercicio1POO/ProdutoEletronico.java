package Exercicio1POO;

//1- Crie a Classe
public class ProdutoEletronico {

//2- Crie os atributos
	private String tipodeproduto, marca, modelo;
	private String cor;
	private double tela;

//3- Crie o Construtor, os argumentos e faça o link com os atributos
	public ProdutoEletronico (String tipo, String marca, String modelo, String cor, double tela)
	{
		tipodeproduto = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.tela = tela;
	}
		
//4- Crie os métodos
		
		public void ImprimirInfo ()
		{
			System.out.println("O tipo produto cadastrado é: "+tipodeproduto+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCor: "+cor+"\nTamanho da Tela: "+tela);
		}

		public String getTipodeproduto() {
			return tipodeproduto;
		}

		public void setTipodeproduto(String tipodeproduto) {
			this.tipodeproduto = tipodeproduto;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public double getTela() {
			return tela;
		}

		public void setTela(double tela) {
			this.tela = tela;
		}
		


	}

