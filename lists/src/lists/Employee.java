package lists;

public class Employee {
	
	private Integer id;
	private String name;
	private double salary;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(Integer id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return this.id + ", " + this.name + ", " + String.format("%.2f", this.salary) + "\n";
	}
	
	public void increaseSalary(double percentage) {
		setSalary(getSalary() + (getSalary()*percentage)/100);
	}
	
	
	
}
