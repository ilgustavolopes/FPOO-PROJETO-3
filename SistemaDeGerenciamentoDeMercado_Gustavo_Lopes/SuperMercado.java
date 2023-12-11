package SistemaDeGerenciamentoDeMercado_Gustavo_Lopes;

import javax.swing.JOptionPane;
import java.util.ArrayList;

//no minimo 3 clientes e 5 produtos
public class SuperMercado {
	//atributos
	private String nome;
	private Estoque estoque;
	private ArrayList<Funcionario> controle_entrada;
	//metodos construtores
	public SuperMercado() {
		
	}
	public SuperMercado(String nome, Estoque estoque) {
		this.nome = nome;
		this.estoque = estoque;
	}
	//metodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	public ArrayList<Funcionario> getControle_entrada() {
		return controle_entrada;
	}
	public void setFuncionario(ArrayList<Funcionario> controle_entrada) {
		this.controle_entrada = controle_entrada;
	}
	//metodo especial
	public void exibirProdutosEstoque() {
		for(Produto vassoura : estoque.getProdutos()) {
			JOptionPane.showMessageDialog(null,vassoura.getNome() + "/" + vassoura.getQuantidade() + vassoura.getUnidadeDeMedida() + "/" + "R$"+vassoura.getPreco() + "/" +"perecivel:" + vassoura.getPerecivel() + "/" + vassoura.getCategoria() + "/ " + vassoura.getDataFab() + "/" + vassoura.getDataVal() + "/" + vassoura.getDesc());
		}
		JOptionPane.showMessageDialog(null,"Quantidade de produtos no estoque: " + estoque.getProdutos().size());
	    
	}
}
