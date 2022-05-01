package br.com.fateczl.lipe.view;

import java.util.ArrayList;

import br.com.fateczl.lipe.controller.IProdutoController;
import br.com.fateczl.lipe.controller.ProdutoController;
import br.com.fateczl.lipe.model.CorProduto;
import br.com.fateczl.lipe.model.ModeloProduto;
import br.com.fateczl.lipe.model.Produto;

public class Loja {

	public static void main(String[] args) {
		IProdutoController pController = new ProdutoController();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		try {
			produtos.add(pController.cadastrarCalcado("35", CorProduto.AZUL, ModeloProduto.SOCIAL, 200.50));
			produtos.add(pController.cadastrarCalcado("40", CorProduto.VERDE, ModeloProduto.TENIS, 500));
			produtos.add(pController.cadastrarCalcado("39", CorProduto.PRETO, ModeloProduto.SOCIAL, 350));
			produtos.add(pController.cadastrarCamiseta("GG", CorProduto.ROSA, "Nike", 150));
			produtos.add(pController.cadastrarCamiseta("P", CorProduto.BRANCO, "Adidas", 120));
			produtos.add(pController.cadastrarCamiseta("M", CorProduto.CINZA, "Lacoste", 100));
			produtos.add(pController.cadastrarEquipamentoDeArmazenamento(ModeloProduto.SSD, 240, "Kingston", 190));
			produtos.add(pController.cadastrarEquipamentoDeArmazenamento(ModeloProduto.SSD, 128, "Husky", 100));
			produtos.add(pController.cadastrarEquipamentoDeArmazenamento(ModeloProduto.HDD, 2000, "Seagate", 300));
			produtos.add(pController.cadastrarJogoEletronico("PS5", ModeloProduto.PLAYSTATION, 4500));
			produtos.add(pController.cadastrarJogoEletronico("360", ModeloProduto.XBOX, 1290));
			produtos.add(pController.cadastrarJogoEletronico("Series X", ModeloProduto.XBOX, 5200));
			
			for (Produto p : produtos) {
				System.out.println(p.toString());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

}
