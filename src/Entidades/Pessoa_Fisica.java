package Entidades;

public class Pessoa_Fisica extends Contribuinte{

	private Double saude;

	public Pessoa_Fisica() {
	}
	
	public Pessoa_Fisica(String nome, Double renda, Double saude) {
		super(nome, renda);
		this.saude = saude;
	}

	public Double getSaude() {
		return saude;
	}

	public void setSaude(Double saude) {
		this.saude = saude;
	}

	@Override
	public double imposto() {
		if (super.getRenda() < 20000) {
			return (super.getRenda() * 0.15) - (saude * 0.5);
		}
		else {
			return (super.getRenda() * 0.25) - (saude * 0.5);
		}
	}
}
