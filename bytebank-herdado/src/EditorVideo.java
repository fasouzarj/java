//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do EDITOR DE VIDEO");
		return 150;
	}	

}