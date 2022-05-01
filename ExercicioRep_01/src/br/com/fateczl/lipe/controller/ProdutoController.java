package br.com.fateczl.lipe.controller;

import br.com.fateczl.lipe.model.CorProduto;
import br.com.fateczl.lipe.model.ModeloProduto;
import br.com.fateczl.lipe.model.Produto;
import br.com.fateczl.lipe.model.ProdutoBuilder;

public class ProdutoController implements IProdutoController {

	@Override
	public Produto cadastrarCalcado(String tamanho, CorProduto cor, ModeloProduto modelo, double valor) throws Exception {
		if (Integer.parseInt(tamanho) < 35 || Integer.parseInt(tamanho) > 44)
			throw new Exception("Tamanho do calçado fora do intervalo permitido!");
		
		return ProdutoBuilder.builder()
				.addTamanho(tamanho)
				.addCor(cor)
				.addModelo(modelo)
				.addValor(valor)
				.get();
	}

	@Override
	public Produto cadastrarCamiseta(String tamanho, CorProduto cor, String marca, double valor) throws Exception {
		return ProdutoBuilder.builder()
				.addTamanho(tamanho)
				.addCor(cor)
				.addMarca(marca)
				.addValor(valor)
				.get();
	}

	@Override
	public Produto cadastrarJogoEletronico(String nome, ModeloProduto modelo, double valor) throws Exception {
		return ProdutoBuilder.builder()
				.addNome(nome)
				.addModelo(modelo)
				.addValor(valor)
				.get();
	}

	@Override
	public Produto cadastrarEquipamentoDeArmazenamento(ModeloProduto modelo, int capacidade, String fabricante,
			double valor) throws Exception {
		return ProdutoBuilder.builder()
				.addModelo(modelo)
				.addCapacidade(capacidade)
				.addFabricante(fabricante)
				.get();
	}

}
