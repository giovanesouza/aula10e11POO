package projetopessoas;

// PESSOA É MÃE E ALUNO É FILHO
public class Aluno extends Pessoa {
	
	private int matr;
	private boolean matriculado;
	private String curso;
	
	
	
	// MÉTODO INTERNO
	public void cancelarMatr(boolean matriculado) {
		
		if (matriculado == true) {
			this.setMatriculado(false);
			System.out.println("Caro aluno(a), " + this.getNome() + ", sua matrícula foi cancelada!");
			
		} else {
			
			System.out.println("Impossível cancelar matrícula ou Aluno não matriculado!");
			
		}
	}

	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + this.getNome());
		}


	// MÉTODOS ESPECIAIS
	public int getMatr() {
		return matr;
	}
	
	public void setMatr(int matr) {
		this.matr = matr;
	}
	
	public boolean getMatriculado() {
		return matriculado;
	}
	
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
