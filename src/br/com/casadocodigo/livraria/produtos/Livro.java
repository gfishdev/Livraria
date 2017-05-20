package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Produto {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;

	public Livro(Autor autor) {
		this.isbn = "000-00-00000-00-0";
		this.autor = autor;
	}

	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("ISBN: " + this.isbn);

		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}

		System.out.println("--");
	}

	boolean temAutor() {
		return this.autor != null;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return this.autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
