package Eleicao;

import javax.swing.JOptionPane;

public class Metodos {
	
	Votacao[] votacao1 = new Votacao[5];
	Votacao[] votacao2 = new Votacao[5];
	CadastroEleitor[] c = new CadastroEleitor[10];
	
	public CadastroEleitor[] CadastraEleitor(CadastroEleitor[] c) {
		int i;
		
		for(i = 0; i<10; i++) {
			c[i].NumeroEleitor = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do Eleitor: "));
			c[i].NomeEleitor = JOptionPane.showInputDialog("Informe o nome do Eleitor: ");
			c[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Informe a seção do candidato: "));
		}
		return c;
	}

	public void CadastraVotacao1e2() {
		int opc=0;
		
		while(opc != 9) {
			switch(opc) {
			case 1: votacao1 = CadastraVotacao1(votacao1, c);
			        break;
			case 2: votacao2 = CadastraVotacao2(votacao2, c);
			        break;
			case 9: JOptionPane.showMessageDialog(null, "Fim de cadastro");
			}
		}
		
	}

	public Votacao[] CadastraVotacao2(Votacao[] votacao2, CadastroEleitor[] c) {
		int i;
      for(i = 0; i<5; i++) {
			
    	  while(votacao2[i].secao != 5 & votacao2[i].secao != 9 & votacao2[i].secao != 10) {
			votacao2[i].CodCandidato = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do candidato: "));
			
			switch(votacao2[i].CodCandidato) {
			case 1: JOptionPane.showMessageDialog(null, "JOSE");
			    break;
			case 2: JOptionPane.showMessageDialog(null, "MARIA");
			    break;
			case 3: JOptionPane.showMessageDialog(null, "BRANCO");
			    break;
			case 4: JOptionPane.showMessageDialog(null, "NULO");
			   break;
			default: JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
			}
			
			votacao2[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Informe a seção do candidato: "));
		  }
			votacao2[i].NumEleitor = c[i].NumeroEleitor;
		}
		return votacao2;
	}

	public Votacao[] CadastraVotacao1(Votacao[] votacao1, CadastroEleitor[] c) {
		int i;
		for(i = 0; i<5; i++) {
			
		  while(votacao1[i].CodCandidato != 1 & votacao1[i].CodCandidato != 3 & votacao1[i].CodCandidato != 4) {
			  
			votacao1[i].CodCandidato = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do candidato: "));
			
			switch(votacao1[i].CodCandidato) {
			case 1: JOptionPane.showMessageDialog(null, "JOSE");
			    break;
			case 2: JOptionPane.showMessageDialog(null, "MARIA");
			    break;
			case 3: JOptionPane.showMessageDialog(null, "BRANCO");
			    break;
			case 4: JOptionPane.showMessageDialog(null, "NULO");
			    break;
			default: JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
			}
			
		 votacao1[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Informe a seção do candidato: "));
		  }
			votacao1[i].NumEleitor = c[i].NumeroEleitor;
		}
		return votacao1;
	}

	public void MenuEstatistica(Votacao[] apuracao, CadastroEleitor[] c2) {
		int opc = 0;
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1 - Vencedor \n 2 - Segundo Colocado"
					+ " \n 3 - Quantidade de votos em branco \n 4 - Quantidade de votos Nulos \n"
					+ " 5 - Mostra Eleitores \n 6 - Mostra Apuração \n 9 - Finaliza"));
			switch(opc) {
			case 1: Vencedor(apuracao);
			        break;
			case 2: SegundoColocado(apuracao);
			        break;
			case 3: VotosEmBranco(apuracao);
			        break;
			case 4: VotosEmNulo(apuracao);
			        break;
			case 5: MostraEleitores(c2);
			        break;
			case 6: MostrarApuracao(apuracao);
			        break;
			case 9: JOptionPane.showMessageDialog(null, "Fim");
			        break;
			default: JOptionPane.showMessageDialog(null, "Opcão Inválida, digite novamente");
			}
		}
		
	}

	private void MostrarApuracao(Votacao[] apuracao) {
		int i;
		for(i = 0; i<10; i++) {
			System.out.println("O resultado da apuração foi: " + apuracao[i].CodCandidato);
		}
		System.out.println("________________________________________________________________________________");
	}

	public void MostraEleitores(CadastroEleitor[] c2) {
		int i;
		for(i = 0; i<10; i++) {
			System.out.println("O nome do Eleitor: " + c2[i].NomeEleitor);
			System.out.println("O número de Eleitor: " + c2[i].NumeroEleitor);
			System.out.println("A seção em que votou: " + c2[i].secao);
		}
		System.out.println("________________________________________________________________________________");
	}

	public void VotosEmNulo(Votacao[] apuracao) {
		int i,soma = 0;
		   for(i =0; i<10; i++) {
			   if(apuracao[i].CodCandidato == 4) {
				   soma = soma + 1;
			   }
		   }
		   System.out.println(soma +" Pessoas votaram em nulo");
		   System.out.println("________________________________________________________________________________");
		}

	public void VotosEmBranco(Votacao[] apuracao) {
	   int i,soma = 0;
	   for(i =0; i<10; i++) {
		   if(apuracao[i].CodCandidato == 3) {
			   soma = soma + 1;
		   }
	   }
	   System.out.println(soma +" Pessoas votaram em branco");
	   System.out.println("________________________________________________________________________________");
	}

	public void SegundoColocado(Votacao[] apuracao) {
		System.out.println("O segundo colocado é: " + apuracao[2].CodCandidato);
		System.out.println("________________________________________________________________________________");
		
	}

	public void Vencedor(Votacao[] apuracao) {
		System.out.println("O vencedor é: " + apuracao[1].CodCandidato);
		System.out.println("________________________________________________________________________________");
		
	}

	public Votacao[] AgrupaApuracao(Votacao[] apuracao, Votacao[] votacao1, Votacao[] votacao2) {
		int i,j, aux;
		
		for(i = 0; i < 10; i++) {
			apuracao[i].secao = votacao1[i].secao;
			apuracao[i + 5].secao = votacao2[i].secao;
			
			apuracao[i].CodCandidato = votacao1[i].CodCandidato;
			apuracao[i + 5].CodCandidato = votacao2[i].CodCandidato;
			
			apuracao[i].NumEleitor = votacao1[i].NumEleitor;
			apuracao[i + 5].NumEleitor = votacao2[i].NumEleitor;
		}
	    for(i=0; i<=9; i++) {
	    	for(j=(i+1); j<10; j++) {
	    		if(apuracao[i].CodCandidato > apuracao[j].CodCandidato) {
	    			aux = apuracao[i].CodCandidato;
	    			apuracao[i].CodCandidato = apuracao[j].CodCandidato;
	    			apuracao[j].CodCandidato = aux;
	    		}
	    	}
	    }
		return apuracao;
	}
	
	
}
