package Eleicao;

import javax.swing.JOptionPane;

public class Principal {
  public static void main(String args []) {
	  CadastroEleitor[] c = new CadastroEleitor[10];
	  Votacao[] apuracao = new Votacao[10];
	  Metodos m = new Metodos();
	  Votacao[] votacao1 = new Votacao[5];
	  Votacao[] votacao2 = new Votacao[5];
	  int opc = 0;
	  int i;
	  
	  for(i = 0; i<10; i++) {
		  c[i] = new CadastroEleitor();
	  }
	  
	  while(opc != 9) {
		  opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1 - Cadastra Eleitor \n 2 - Cadastra Votacão 1 e 2"
		  		+ " \n 3 - Agrupa apuração \n 4 - Menu estatistica \n 9 - Programa Finalizado"));
		  
		  switch(opc) {
		    case 1: c = m.CadastraEleitor(c);
		                break;
		    case 2: m.CadastraVotacao1e2();
		                break;
		    case 3: apuracao = m.AgrupaApuracao(apuracao, votacao1, votacao2);
		                break;
		    case 4: m.MenuEstatistica(apuracao, c);
		                break;
		    case 9: JOptionPane.showMessageDialog(null, "Programa Finalizado");
		                break;
		    default: JOptionPane.showMessageDialog(null, "Opção Inválida, digite novamente");
		  }
	  }
  }
}
