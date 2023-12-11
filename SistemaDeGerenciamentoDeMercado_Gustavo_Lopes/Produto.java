package SistemaDeGerenciamentoDeMercado_Gustavo_Lopes;

public class Produto {
	//atributos
	private String nome;
	private String dataFab;
	private String dataVal;
	private String desc;
	private double preco;
	private boolean perecivel;
	private String categoria;
	private int quantidade;
	private String unidadeDeMedida = "g";
	//metodos construtores
	public Produto() {
		//default
	}
	public Produto(String nome, String dataFab, String dataVal, String desc, double preco, 
	boolean perecivel, String categoria, int quantidade, String unidadeDeMedida) {//com parametros
				this.nome = nome;
				this.dataFab = dataFab;
				this.dataVal = dataVal;
				this.desc = desc;
				this.preco = preco;
				this.perecivel = perecivel;
				this.categoria = categoria;
				this.quantidade = quantidade;
				this.unidadeDeMedida = unidadeDeMedida;
}
	//metodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataFab() {
		return dataFab;
	}
	public void setDataFab(String dataFab) {
		this.dataFab = dataFab;
	}
	public String getDataVal() {
		return dataVal;
	}
	public void setDataVal(String dataVal) {
		this.dataVal = dataVal;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean getPerecivel() {
		return perecivel;
	}
	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getUnidadeDeMedida() {
		return unidadeDeMedida;
	}
	public void setUnidadeDeMedida(String unidadeDeMedida) {
		this.unidadeDeMedida = unidadeDeMedida;
	}
	public void testPerecivel() {
		if(perecivel == true) {
			System.out.println("perecivel");
		}else
			System.out.println("inperecivel");
	}
	
}