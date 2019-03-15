package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoBO {
	// private static Logger log = Logger.getLogger(EstoqueBO.class);
	
	private static ArrayList<ProdutoTO> lista = new ArrayList<ProdutoTO>();
	private static ProdutoBO produtoBo;
	
	
	public static ProdutoBO getInstance() {
		if (produtoBo == null) {
			produtoBo = new ProdutoBO();
		}
		return produtoBo;
	}

	
	public ProdutoBO() {
		lista.add(ProdutoBO.consultarBO(401));
		lista.add(ProdutoBO.consultarBO(402));
		lista.add(ProdutoBO.consultarBO(403));
		
	}
	
	public static ProdutoTO consultarBO(int codProd) {
	

		if (codProd == 401) {
			// log.debug(codProd + " - " + " Camisa Branca");
			return new ProdutoTO(codProd, 2.99, 4, "Camisa Branca");

		} else if (codProd == 402) {
			// log.debug(codProd + " - " + " Camisa Azul");
			return new ProdutoTO(codProd, 2.99, 4, "Camisa Azul");
			
			// System.out.println( p.getDescricao());
		} else if (codProd == 403) {
			// log.debug(codProd + " - " + " Camisa Rosa");
			return new ProdutoTO(codProd, 2.99, 4, "Camisa Rosa");
			
		} else {
			// log.error(codProd + " - " + "Produto n�o encontrado");
			return new ProdutoTO(-1, 0, 0, "Produto n�o encontrado");
		}
	}

	public List<ProdutoTO> listar() {
		return lista ;
	}
	
	
	public void cadastar(ProdutoTO produto) {
		lista.add(produto);
	}
	
	public ProdutoTO listar(int codigo) {
		return consultarBO(codigo);
	}
	
	
	

}
