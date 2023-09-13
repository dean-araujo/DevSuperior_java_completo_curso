package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual, Integer numFuncionarios) {
		super(name, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	public Double calcImposto() {
		Double txImp = 0.0, imp = 0.0;
		if (numFuncionarios > 10) {
			txImp = 0.14;
		} else {
			txImp = 0.16;
		}
		return imp += rendaAnual * txImp;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
