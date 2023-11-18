package Eleicao;

public class CadastroEleitor {
	
	int NumeroEleitor;
	String NomeEleitor;
	int secao;
	
	CadastroEleitor(){
		this(0," ",0);
	}
	
	public CadastroEleitor(int num, String nome, int s) {
		NumeroEleitor = num;
		NomeEleitor = nome;
		secao = s;
	}

}
