package SistemaDeGerenciamentoDeMercado_Gustavo_Lopes;
import java.util.ArrayList;
import java.util.List;
public class Estoque {
	//atributos
	private ArrayList<Produto> produtos;//essa lista no teste recebera a lista do entregador
	//metodos construtores
	public Estoque(){
		//default
	}
	public Estoque(ArrayList<Produto> produtos) {//com parametros
		this.produtos = produtos;
	}
	//metodos getters e setters
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
