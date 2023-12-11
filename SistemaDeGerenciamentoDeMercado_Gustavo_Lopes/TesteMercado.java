package SistemaDeGerenciamentoDeMercado_Gustavo_Lopes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Spliterator;

import javax.swing.JOptionPane;
//import java.util.List;
//import java.util.Scanner;
public class TesteMercado {

	public static void main(String[] args) {	
		//Scanner entrada = new Scanner(System.in);
		
		//tudo isso comentario foi a primeira versao do meu codigo
		
		//produtos sao criados(como se estivessem sendo encaixotados na empresa)
		/*Produto p1 = new Produto("Cafe Bello", "11/09/2023", "17/01/2025", "Cafe Bello direto das platacoes da Italia", 16.60, false, "Produto de dispensa", 500, "g");
		Produto p2 = new Produto("Tomate Pomodoro", "11/09/2023", "21/09/23", "Tomate Pomodoro direto da Italia", 5.50, true, "Hort-Frut", 5, "unidades");
		Produto p3 = new Produto("Arroz Riso", "11/09/2023", "11/09/25", "Arroz Riso direto dos campos da Italia", 12.50, false, "Graos", 5, "kg");
		Produto p4 = new Produto("Feijao Faggiolo", "11/09/2023", "21/09/23", "Feijao Faggiolo direto das feijoarias da Italia", 10.50, false, "Graos", 1, "kg");
		Produto p5 = new Produto("Acucar Zucchero Dolce", "11/09/2023", "21/01/24", "Acucar Zucchero Dolce direto da Italia", 5.50, true, "Graos", 1, "kg");
		//instanciando entregador e sua lista de produtos vazia a fornecer para o mercado
		ArrayList<Produto> lista_entregador = new ArrayList<Produto>();
		ArrayList<Produto> lista_estoque = new ArrayList<Produto>(60);
		Entregador e1 = new Entregador("Giuseppe", "Piccoli Fratelli Italliani", lista_entregador);
		//adicionando na lista vazia do entregador seus produtos de entrega
		lista_entregador.add(p1);
		lista_entregador.add(p2);
		lista_entregador.add(p3);
		lista_entregador.add(p4);
		lista_entregador.add(p5);
		lista_estoque = lista_entregador;
		//instanciando o estoque do mercado
		Estoque est1 = new Estoque(lista_estoque);//agora o estoque tem os produtos do entregador
		//instanciando mercado
		SuperMercado sm1 = new SuperMercado("Mercato Lopes", est1);/*mercado instanciado se chama mercato lopes e recebeu o estoque1 como seu estoque*/
		//testando
		/*System.out.println("il " + sm1.getNome() + " recebeu os produtos:\n");
		sm1.exibirProdutosEstoque();
		System.out.println("\nDo Fornecedor: " + e1.nome + "\nDa Empresa: " + e1.empresa);
		System.out.println("\nAtualizacao do estoque:\n" + "Quantidade de Produtos: " + lista_estoque.size());*/
		
		
		//começando o real (ali em cima era so teste)
		
		Funcionario e1 = new Funcionario();//instancia de funcionario
		SuperMercado sm1 = new SuperMercado();//instancia de mercado
		sm1.setNome("Mercato Lopes");
		JOptionPane.showMessageDialog(null,"Seja bem vindo ao sistema de estocagem do " + sm1.getNome());
		e1.setNome(JOptionPane.showInputDialog("Funcionario digite seu nome:"));
		e1.setEmpresaFornecedora(JOptionPane.showInputDialog("Qual empresa forneceu os produtos:"));
		ArrayList <Funcionario> listaDeControle = new ArrayList<Funcionario>();//instancia de lista vazia de funcionario
		listaDeControle.add(e1);//adicionando o funcionario e1 a lista de funcionario
		sm1.setFuncionario(listaDeControle);//mercado recebe a lista de controle

		
		JOptionPane.showMessageDialog(null,"ACESSANDO SISTEMA");
		
		
	
		JOptionPane.showMessageDialog(null,"Produto 1");
		Produto p1 = new Produto();//instancia do produto 1
		p1.setNome(JOptionPane.showInputDialog("Qual o nome do produto:"));
		p1.setDataFab(JOptionPane.showInputDialog("Digite a data de fabricacao do produto (xx/dd/yyyy):"));
		p1.setDataVal(JOptionPane.showInputDialog("Digite a data de validade do produto (xx/dd/yyyy):"));
		p1.setDesc(JOptionPane.showInputDialog("Digite a descricao do produto:"));
		String i = JOptionPane.showInputDialog("Digite o preco do produto:");
		p1.setPreco(Double.parseDouble(i));//conversao de tipos pq o joption ta pegando texto
		String a = JOptionPane.showInputDialog("Produto Perecivel (sim ou nao):");
		if(a == "sim") {
			p1.setPerecivel(true);
		}else {
			p1.setPerecivel(false);
		}
		p1.setCategoria(JOptionPane.showInputDialog("Qual a categoria de seu produto:"));
		String d = JOptionPane.showInputDialog("Qual a quantidade de seu produto:");
		p1.setQuantidade(Integer.parseInt(d));
		p1.setUnidadeDeMedida(JOptionPane.showInputDialog("Unidade de medida:"));
		
		
		JOptionPane.showMessageDialog(null,"Produto 2");
		Produto p2 = new Produto();//instancia do produto 2
		p2.setNome(JOptionPane.showInputDialog("Qual nome do produto:"));
		p2.setDataFab(JOptionPane.showInputDialog("Digite a data de fabricacao do produto (xx/dd/yyyy):"));
		p2.setDataVal(JOptionPane.showInputDialog("Digite a data de validade do produto (xx/dd/yyyy):"));
		p2.setDesc(JOptionPane.showInputDialog("Digite a descricao do produto:"));
		String y = JOptionPane.showInputDialog("Digite o preco do produto:");
		p2.setPreco(Double.parseDouble(y));//conversao de tipos pq o joption ta pegando texto
		String b = JOptionPane.showInputDialog("Produto Perecivel (sim ou nao):");
		if(b == "sim") {
			p2.setPerecivel(true);
		}else {
			p2.setPerecivel(false);
		}
		p2.setCategoria(JOptionPane.showInputDialog("Qual a categoria de seu produto:"));
		String x = JOptionPane.showInputDialog("Qual a quantidade de seu produto:");
		p2.setQuantidade(Integer.parseInt(x));
		p2.setUnidadeDeMedida(JOptionPane.showInputDialog("Unidade de medida:"));
		
		JOptionPane.showMessageDialog(null,"Produto 3");
		Produto p3 = new Produto();//instancia do produto 3
		p3.setNome(JOptionPane.showInputDialog("Qual nome do produto:"));
		p3.setDataFab(JOptionPane.showInputDialog("Digite a data de fabricacao do produto (xx/dd/yyyy):"));
		p3.setDataVal(JOptionPane.showInputDialog("Digite a data de validade do produto (xx/dd/yyyy):"));
		p3.setDesc(JOptionPane.showInputDialog("Digite a descricao do produto:"));
		String h = JOptionPane.showInputDialog("Digite o preco do produto:");
		p3.setPreco(Double.parseDouble(h));//conversao de tipos pq o joption ta pegando texto
		String l = JOptionPane.showInputDialog("Produto Perecivel (sim ou nao):");
		if(l == "sim") {
			p3.setPerecivel(true);
		}else {
			p3.setPerecivel(false);
		}
		p3.setCategoria(JOptionPane.showInputDialog("Qual a categoria de seu produto:"));
		String t = JOptionPane.showInputDialog("Qual a quantidade de seu produto:");
		p3.setQuantidade(Integer.parseInt(t));
		p3.setUnidadeDeMedida(JOptionPane.showInputDialog("Unidade de medida:"));
		
		JOptionPane.showMessageDialog(null,"Produto 4");
		Produto p4 = new Produto();//instancia do produto 4
		p4.setNome(JOptionPane.showInputDialog("Qual nome do produto:"));
		p4.setDataFab(JOptionPane.showInputDialog("Digite a data de fabricacao do produto (xx/dd/yyyy):"));
		p4.setDataVal(JOptionPane.showInputDialog("Digite a data de validade do produto (xx/dd/yyyy):"));
		p4.setDesc(JOptionPane.showInputDialog("Digite a descricao do produto:"));
		String g = JOptionPane.showInputDialog("Digite o preco do produto:");
		p4.setPreco(Double.parseDouble(g));//conversao de tipos pq o joption ta pegando texto
		String u = JOptionPane.showInputDialog("Produto Perecivel (sim ou nao):");
		if(u == "sim") {
			p4.setPerecivel(true);
		}else {
			p4.setPerecivel(false);
		}
		p4.setCategoria(JOptionPane.showInputDialog("Qual a categoria de seu produto:"));
		String j = JOptionPane.showInputDialog("Qual a quantidade de seu produto:");
		p4.setQuantidade(Integer.parseInt(j));
		p4.setUnidadeDeMedida(JOptionPane.showInputDialog("Unidade de medida:"));
		
		JOptionPane.showMessageDialog(null,"Produto 5");
		Produto p5 = new Produto();//instancia do produto 5
		p5.setNome(JOptionPane.showInputDialog("Qual nome do produto:"));
		p5.setDataFab(JOptionPane.showInputDialog("Digite a data de fabricacao do produto (xx/dd/yyyy):"));
		p5.setDataVal(JOptionPane.showInputDialog("Digite a data de validade do produto (xx/dd/yyyy):"));
		p5.setDesc(JOptionPane.showInputDialog("Digite a descricao do produto:"));
		String n = JOptionPane.showInputDialog("Digite o preco do produto:");
		p5.setPreco(Double.parseDouble(n));//conversao de tipos pq o joption ta pegando texto
		String v = JOptionPane.showInputDialog("Produto Perecivel (sim ou nao):");
		if(v  ==  "sim") {
			p5.setPerecivel(true);
		}else {
			p5.setPerecivel(false);
		}
		p5.setCategoria(JOptionPane.showInputDialog("Qual a categoria de seu produto:"));
		String z = JOptionPane.showInputDialog("Qual a quantidade de seu produto:");
		p5.setQuantidade(Integer.parseInt(z));
		p5.setUnidadeDeMedida(JOptionPane.showInputDialog("Unidade de medida:"));
		//lista estoque
		ArrayList <Produto> lista_estoque = new ArrayList <Produto>();
		Produto pt = new Produto("Arroz Riso", "18/09/2023", "24/12/2023", "Arroz fresquinho direto da Italia", 12.33, true, "graos", 10, "kg");
		lista_estoque.add(pt);//adicionando produto que ja estaria no estoque
		ArrayList <Produto> lista_funcionario = new ArrayList<Produto>();//instanciando a lista do funcionario e adicionando os produtos nela
		lista_funcionario.add(p1);
		lista_funcionario.add(p2);
		lista_funcionario.add(p3);
		lista_funcionario.add(p4);
		lista_funcionario.add(p5);
		//add lista do funcionario na do estoque
		lista_estoque = lista_funcionario;
		//instanciando estoque
		Estoque es1 = new Estoque();
		es1.setProdutos(lista_estoque);//lista de produtos do est1 recebe lista do estoque criada aq(ali em cima)
		sm1.setEstoque(es1);//mercado receb estoque
		
		//exibindo produtos adicionados pelo funcionario
		JOptionPane.showMessageDialog(null,"Dados do Funcionario na entrada 1");
		JOptionPane.showMessageDialog(null,"Funcionario:  " + e1.nome + "\n" + "Empresa Fornecedora:  " + e1.empresaFornecedora);
		for(Produto esfregao : lista_funcionario) {//lendo a lista do funcionario, os produtos que ele adicionou
			JOptionPane.showMessageDialog(null,esfregao.getNome() + "/" + esfregao.getQuantidade() + esfregao.getUnidadeDeMedida() + "/" + "R$"+ esfregao.getPreco() + "/" +"perecivel:" + esfregao.getPerecivel() + "/" + esfregao.getCategoria() + "/ " + esfregao.getDataFab() + "/" + esfregao.getDataVal() + "/" + esfregao.getDesc());
		}
		JOptionPane.showMessageDialog(null,"Foram adicionados" + lista_funcionario.size());
		//exibindo produtos do supermercado
		JOptionPane.showMessageDialog(null,"Produtos Estoque do mercado:");
		Produto ph = new Produto("Cafe Bello", "11/09/2023", "17/01/2025", "Cafe Bello direto das platacoes da Italia", 16.60, false, "Produto de dispensa", 500, "g");
		lista_estoque.add(ph);
		sm1.exibirProdutosEstoque();//usando metodo de exibir produtos do estoque para ver o estoque
	}
}
