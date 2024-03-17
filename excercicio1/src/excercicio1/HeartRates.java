package excercicio1;

public class HeartRates {
	protected String nome;
	protected String snome;
	protected int[] datanascimento=new int[3];
	public HeartRates(String nome, String snome, int datanascimento[]){//metodo constructor
		this.nome=nome;
		this.snome=snome;
		int i;
		for(i=0;i<2;i++) {
			this.datanascimento[i]= datanascimento[i];
		}
	}
	public void setnome(String nome){//guarda o nome
		this.nome=nome;
	}
	public void setsnome(String snome){//guarda sobre nome
		this.snome=snome;
	}
	public void setdatanascimento(int datanascimento[]){//guarda as partes da idade em posicoes da variavel
		int i;
		for(i=0;i<2;i++) {
			this.datanascimento[i]= datanascimento[i];
		}
	}
	public String getnome(){//busca nome
		return this.nome;
	}
	public String getsnome(){//busca sobre nome
		return this.snome;
	}
	public int[] getdatanascimento(){//busca data de nascimento
		return this.datanascimento;
	}
	public int getidade(){// busca idade
		int idade = this.datanascimento[3] - 2024;
		return idade;
	}
	public int freqcardmax(){// busca frequencia cardiaca maxima
		int freqmax = 220 - this.getidade();
		return freqmax;
	}
	public int[] freqcardalvo() {// busca frequencia cardiaca alvo
		int[] freqalvo = new int[2];
		freqalvo[0]= (int) (0.5 * this.freqcardmax());
		freqalvo[1]= (int) (0.85 * this.freqcardmax());
		return freqalvo;
	}

}
