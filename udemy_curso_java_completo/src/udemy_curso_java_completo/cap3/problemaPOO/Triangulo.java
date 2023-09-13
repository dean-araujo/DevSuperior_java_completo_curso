package udemy_curso_java_completo.cap3.problemaPOO;

public class Triangulo {
	public double a, b, c;
	public String name;

	
	public Triangulo(double a, double b, double c, String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.name = name;
	}

	public double calcP() {
		double p = (a+b+c)/2;
		return p;
	}
	
	public double calcArea() {
		double p = calcP();
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
	
	public String largerArea(String name1, double area1, String name2, double area2) {
		if (area1 > area2) {
			return name1;
		} else {
			return name2;
		}
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
