package projetopessoas;

// AULAS 10 E 11 POO

public class ProjetoPessoas {

	public static void main(String[] args) {


		Bolsista p1 = new Bolsista();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor ();
		Funcionario p4 = new Funcionario ();
		Visitante p5 = new Visitante();

		// ALUNO BOLSISTA
		p1.setNome("Pedro");
		p1.pagarMensalidade();
		 
		//ALUNO
		p2.setNome("Maria");
		
		// PROFESSOR
		p3.setNome("José");
		
		// FUNCIONÁRIO
		p4.setNome("Fabiana");
		
		// VISITANTE
		p5.setNome("Julia");

		
		//p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(18);

		p2.setCurso("Informática");

		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");

		p2.cancelarMatr(true);
		p2.setMatr(12);
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString() + " Visitante");
		
		
	}

}
