package projetolivro;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 25,"M");
		p[1] = new Pessoa("Maria", 35,"F");
		
		l[0] = new Livro("Aprendendo Java", "Jose Moura", 300, p[0]);
		l[1] = new Livro("POO para iniciantes", "Lucas Mozart", 600, p[1]);
		
		
		l[0].abrir();
		l[0].folhear(101);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());

		
	}

}
