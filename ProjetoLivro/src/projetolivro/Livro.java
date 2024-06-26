package projetolivro;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totPagina;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public String detalhes() {
		return "Livro [titulo = " + titulo + ",\n autor = " + autor + ",\n totPagina = " + totPagina + ",\n pagAtual = "
				+ pagAtual + ",\n aberto = " + aberto + ",\n leitor = " + leitor.getNome() + ",\n Idade = "
				+ leitor.getIdade() + ",\n Sexo = " + leitor.getSexo() + "]";
	}
	//linha 2
	public Livro(String titulo, String autor, int totPagina, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPagina = totPagina;
		this.leitor = leitor;
		this.aberto = false;
		this.pagAtual = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPagina() {
		return totPagina;
	}

	public void setTotPagina(int totPagina) {
		this.totPagina = totPagina;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.aberto = true;
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		if (p > this.totPagina) {
			this.pagAtual = 0;
		} else {
			this.pagAtual = p;
		}
		
	}

	@Override
	public void avancarPag() {
		// TODO Auto-generated method stub
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		this.pagAtual--;
	}

}
