package br.com.main;

import br.com.gabriel.veiculo.LigarVeiculo;
import br.com.gabriel.veiculo.VeiculoFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VeiculoFactory objVeiculoFactory = new VeiculoFactory();
		LigarVeiculo carro = objVeiculoFactory.criarVeiculos("carro");
		carro.Ligar();
		
		LigarVeiculo moto = objVeiculoFactory.criarVeiculos("moto");
		moto.Ligar();

	}

}
