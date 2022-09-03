package projetopessoas;

//PESSOA É MÃE E PROFESSOR É FILHO
public class Professor extends Pessoa {
	
	private String especialidade;
	private float salario;
	
	// MÉTODO INTERNO
	public void receberAum(float aum) {
		this.salario += aum;		
	}

	
	// MÉTODOS ESPECIAIS
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}
