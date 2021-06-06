import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String cor1;
		String cor2;
		String textoDaTela="Escolha a cor primaria:\n1- Azul; \n2- Amarelo; \n3- Vermelho";
		String mensagemErro="Digite as cores certas";
		
		//Janelinha para digitar a primeira cor 1
		cor1= JOptionPane.showInputDialog(textoDaTela);
		
		//Verifica se a cor1 é Azul, amerelo ou vermelho
		if (cor1.equals("1") || cor1.equals("2") || cor1.equals("3")) {
		
			//Janelinha para digitar a primeira cor 2
			cor2= JOptionPane.showInputDialog(textoDaTela);
		
			//Verifica se a cor2 é Azul, amerelo ou vermelho
			if(cor2.equals("1") || cor2.equals("2") || cor2.equals("3")) {
				
				//aqui começa a verificação da junção das cores
				if(
						//1° AFIRMAÇÃO: Se a cor1 é igual a 1(azul) e a cor2 é igual a 2 (amarelo)
						(cor1.equals("1") && cor2.equals("2")) 
						|| //OU
						//1° AFIRMAÇÃO: se a cor2 é igual a 1(azul) e a cor1 é igual a 2 (amarelo)
						(cor2.equals("1") && cor1.equals("2"))) {
					
					//Se a 1° AFIRMAÇÃO ou a 2° AFIRMAÇÃO estiver certa ira exibir verde
					JOptionPane.showMessageDialog(null, "Verde");
					
				//Se o if não for contemplado se tenta executar o else e verifica sua condição
				}else if(
						//1° AFIRMAÇÃO: Se a cor1 é igual a 1(azul) e a cor2 é igual a 3 (vermelho)
						(cor1.equals("1") && cor2.equals("3"))
						|| //OU
						//2° AFIRMAÇÃO: Se a cor2 é igual a 1(azul) e a cor1 é igual a 3 (vermelho)
						(cor2.equals("1") && cor1.equals("3"))) {
					
					//Se a 1° AFIRMAÇÃO ou a 2° AFIRMAÇÃO estiver certa ira exibir Roxo
					JOptionPane.showMessageDialog(null, "Roxo");
				
				//Se o if e o else if não forem contemplados se tenta executar o else e verifica sua condição
				}else if(
						//1° AFIRMAÇÃO: Se a cor1 é igual a 2(amarelo) e a cor2 é igual a 3 (vermelho)
						(cor1.equals("2") && cor2.equals("3")) 
						|| //OU
						//1° AFIRMAÇÃO: Se a cor2 é igual a 2(amarelo) e a cor1 é igual a 3 (vermelho)
						(cor2.equals("2") && cor1.equals("3"))) {
					
					//Se a 1° AFIRMAÇÃO ou a 2° AFIRMAÇÃO estiver certa ira exibir Laranja
					JOptionPane.showMessageDialog(null, "Laranja");
				}
			}
			//Se a cor2 não é Azul, ou amerelo ou vermelho então executa o else
			else {
				//É exibida a mensagem de erro
				JOptionPane.showMessageDialog(null, mensagemErro);
			}
		}
		//Se a cor1 não é Azul, ou amerelo ou vermelho então executa o else
		else{	
			//É exibida a mensagem de erro
			JOptionPane.showMessageDialog(null, mensagemErro);
		}		
	}
}
