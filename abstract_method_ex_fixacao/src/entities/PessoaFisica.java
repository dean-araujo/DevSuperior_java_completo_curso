package entities;

public class PessoaFisica extends Contribuinte{
	
	private Double gastosComSaude;
	
	public PessoaFisica(){
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastosComSaude) {
		super(name, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	
	@Override
	public Double calcImposto() {
		Double txImp = 0.0, imp = 0.0;
		if (rendaAnual < 20000) {
			txImp = 0.15;
		} else if (rendaAnual >= 20000) {
			txImp = 0.25;
		}
		return imp += (rendaAnual * txImp) - (gastosComSaude * 0.5);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
}
