package entities;

public abstract class Contribuinte {

	protected StringBuilder sb = new StringBuilder();
	
	private String name;
	protected Double rendaAnual;
	
	public Contribuinte() {
	}

	public Contribuinte(String name, Double rendaAnual) {
		super();
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double calcImposto();

	public String toString() {
		sb.append(name + ": ");
		sb.append("$ " + String.format("%.2f", calcImposto()));
		return sb.toString();
	}
	
	
}
