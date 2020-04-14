package exercicio_de_herança;

public class TesterFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario funcionario = new Funcionario();
		Gerente gerente = new Gerente(12345678);
		
		System.out.println("***********************************\r\n" + 
				"NomeAluno: Gabriel Nunes Klein: 0050015874\r\n" + 
				"************************************");
		
		funcionario.setNome("Gabriel");
		funcionario.setCpf("111.111.111.11");
		funcionario.setSalario(800.00);
		
		System.out.println("A bonificação do funcionário é: " + funcionario.getBonificacao()); 
		
		gerente.setNome("Alex");
		gerente.setCpf("222.222.222.22");
		gerente.setSalario(1600.00);
		gerente.setNumFuncGeren(10);
		
		
		gerente.autentica(12345678);
		System.out.println("A bonificação do gerente é: " +gerente.getBonificacao()); 
	}

}
