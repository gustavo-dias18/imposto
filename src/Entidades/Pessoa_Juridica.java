package Entidades;

public class Pessoa_Juridica extends Contribuinte{

	private Integer funcionarios;
	
	public Pessoa_Juridica() {
	}

	public Pessoa_Juridica(String nome, Double renda, Integer funcionarios) {
		super(nome, renda);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double imposto() {
		if (funcionarios < 10) {
			return super.getRenda() * 0.16;
		}
		else {
			return super.getRenda() * 0.14;
		}
	}
}
