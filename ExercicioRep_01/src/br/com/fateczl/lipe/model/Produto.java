package br.com.fateczl.lipe.model;

public class Produto {
	private String tamanho;
	private double valor;
	private String marca;
	private String nome;
	private int capacidade;
	private String fabricante;
	private ModeloProduto modelo;
	private TipoProduto tipo;
	private CorProduto cor;
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public ModeloProduto getModelo() {
		return modelo;
	}
	public void setModelo(ModeloProduto modelo) {
		this.modelo = modelo;
	}
	public TipoProduto getTipo() {
		return tipo;
	}
	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
	public CorProduto getCor() {
		return cor;
	}
	public void setCor(CorProduto cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Produto [tamanho=" + tamanho + ", valor=" + valor + ", marca=" + marca + ", nome=" + nome
				+ ", capacidade=" + capacidade + ", fabricante=" + fabricante + ", modelo=" + modelo + ", tipo=" + tipo
				+ ", cor=" + cor + "]";
	}
	
}
