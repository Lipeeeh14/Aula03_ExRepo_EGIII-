package br.com.fateczl.lipe.controller;

import br.com.fateczl.lipe.model.CorProduto;
import br.com.fateczl.lipe.model.ModeloProduto;
import br.com.fateczl.lipe.model.Produto;

public interface IProdutoController {
	Produto cadastrarCalcado(String tamanho, CorProduto cor, ModeloProduto modelo, double valor) throws Exception;
	Produto cadastrarCamiseta(String tamanho, CorProduto cor, String marca, double valor) throws Exception;
	Produto cadastrarJogoEletronico(String nome, ModeloProduto modelo, double valor) throws Exception;
	Produto cadastrarEquipamentoDeArmazenamento(ModeloProduto modelo, int capacidade, String fabricante, double valor) throws Exception;
}
