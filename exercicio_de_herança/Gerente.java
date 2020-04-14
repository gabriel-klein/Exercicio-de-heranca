package exercicio_de_herança;

public class Gerente extends Funcionario {
	private int senhaEspecial;
	private int numFuncGeren;
	
	public Gerente(int senha)
	{
		this.senhaEspecial = senha;
	}
	
	public Double getBonificacao()
	{
		return super.getBonificacao() + 1000 ;
	}
	public void autentica(int senha) {
		if(senha == this.senhaEspecial)
			System.out.println("Acesso Liberado");
		else
			System.out.println("Acesso Negado");
	}
	public int getSenhaEspecial() {
		return senhaEspecial;
	}
	public void setSenhaEspecial(int senhaEspecial) {
		this.senhaEspecial = senhaEspecial;
	}
	public int getNumFuncGeren() {
		return numFuncGeren;
	}
	public void setNumFuncGeren(int numFuncGeren) {
		this.numFuncGeren = numFuncGeren;
	}
}
