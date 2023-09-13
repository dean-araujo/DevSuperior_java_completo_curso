package udemy_curso_java_completo.cap3.ex3;

public class Student {
	private String nome;
	private double n1;
	private double n2;
	
	public double finalGrade() {
		return n1 + n2 + n3;
	}
	
	public String passOrFailed() {
		if (finalGrade() > 60.0) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}
	
	public double missing(){
		if (passOrFailed().equals("FAILED")) {
			return (double) 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	private double n3;

	public Student(String nome, double n1, double n2, double n3) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
}
