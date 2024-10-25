package br.com.gabriel.veiculo;

public class VeiculoFactory { // classe responsavel por criar objetos de forma automatica

	public LigarVeiculo criarVeiculos(String tipo) {
		
		if(tipo=="moto") {
			return new Moto();
		}else if (tipo=="carro")
			return new Carro();
		
		return null;
	

		
	
	}
}
