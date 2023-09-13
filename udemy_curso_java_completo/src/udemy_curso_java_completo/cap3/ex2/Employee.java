package udemy_curso_java_completo.cap3.ex2;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		setGrossSalary(this.grossSalary + this.grossSalary*(percentage/100));
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public String toString() {
		return "Employee: " + this.name + ", $ " + netSalary();
	}
	
	
}
