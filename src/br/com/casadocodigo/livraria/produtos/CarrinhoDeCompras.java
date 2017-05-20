package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras {

	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;

	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		this.produtos[contador] = produto;
		contador++;
		// produto.aplicaDescontoDe(0.05);
		total += produto.getValor();
	}

	public double getTotal() {
		return this.total;
	}

	public void getProdutos() {
		for (Produto produto : this.produtos) {
			try {
			System.out.println(produto.getValor());
			}
			catch(NullPointerException e) {
			}
		}
	}
}
