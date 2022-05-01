package br.com.fateczl.lipe.model;

public class ProdutoBuilder {
	private Produto produto;
	
	public ProdutoBuilder() {
		this.produto = new Produto();
	}
	
	public static ProdutoBuilder builder() {
		return new ProdutoBuilder();
	}
	
	public ProdutoBuilder addValor(double valor) throws Exception {
		if (valor <= 0)
			throw new Exception("Valor inválido.");
		
		produto.setValor(valor);
		return this;
	}
	
	public ProdutoBuilder addTamanho(String tamanho) {
		produto.setTamanho(tamanho);
		return this;
	}
	
	public ProdutoBuilder addCor(CorProduto cor) {
		produto.setCor(cor);
		return this;
	}
	
	public ProdutoBuilder addModelo(ModeloProduto modelo) {
		produto.setModelo(modelo);
		return this;
	}
	
	public ProdutoBuilder addMarca(String marca) {
		produto.setMarca(marca);
		return this;
	}
	
	public ProdutoBuilder addNome(String nome) {
		produto.setNome(nome);
		return this;
	}
	
	public ProdutoBuilder addCapacidade(int capacidade) throws Exception {
		if (capacidade <= 0)
			throw new Exception("Capacidade inválida.");
		
		produto.setCapacidade(capacidade);
		return this;
	}
	
	public ProdutoBuilder addFabricante(String fabricante) {
		produto.setFabricante(fabricante);
		return this;
	}
	
	public ProdutoBuilder addTipoProduto(TipoProduto tipo) {
		produto.setTipo(tipo);
		return this;
	}
	
	public Produto get() {
		return this.produto;
	}
}