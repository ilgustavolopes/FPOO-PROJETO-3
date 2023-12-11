package SistemaDeGerenciamentoDeMercado_Gustavo_Lopes;
import java.util.ArrayList;
import java.util.List;
public class Funcionario{
	//atributos
	public String nome;
	public String empresaFornecedora;
	private ArrayList<Produto> produtos;
	//metodos construtores
	public Funcionario() {
		
	}
	public Funcionario(String nome, String empresaFornecedora , ArrayList<Produto> produtos) {
		this.nome = nome;
		this.empresaFornecedora = empresaFornecedora;
		this.produtos = produtos;
	}
	//metodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmpresaFornecedora() {
		return empresaFornecedora;
	}
	public void setEmpresaFornecedora(String empresaFornecedora) {
		this.empresaFornecedora = empresaFornecedora;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
}
