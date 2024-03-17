package excercicio1;
import java.util.*;
public class principal {
public static void main(String[] args) {
	String nome;//nome do cliente
	String snome;// sobre nome do cliente
	int[] datanascimento=new int[3];// data de nascimento do cliente
	System.out.println( "----------------------------------------------------------------------------");
	System.out.println( "Bem vindos a calculadora de frequencia cardiaca");
	Scanner scan = new Scanner(System.in);// scanner para receber input do teclado
	while(true) {
		System.out.println( "Nome:");
		nome= scan.next();// recebe nome
		System.out.println( "sobreNome:");
		snome= scan.next();// recebe sobre nome
		System.out.println( "dia nascimento:");
		datanascimento[0]= scan.nextInt();// recebe dia de nascimento
		System.out.println( "mes nascimento:");
		datanascimento[1]= scan.nextInt();// recebe mes de nascimento
		System.out.println( "ano nascimento:");
		datanascimento[2]= scan.nextInt();// recebe ano de nascimento
		HeartRates heart = new HeartRates(nome,snome,datanascimento);// cria objecto para o cliente
		System.out.println( "----------------------------------------------------------------------------");// vai imprimir as informacoes do cliente
		System.out.println( "Nome: "+heart.getnome());
		System.out.println( "sobreNome: "+heart.getsnome());
		System.out.println( "idade:"+heart.getidade());
		System.out.println( "frequencia cardiaca maxima:"+heart.freqcardmax());
		System.out.println( "frequencia cardiaca alvo:"+heart.freqcardalvo());
		System.out.println( "----------------------------------------------------------------------------");
		break;

	}
}
}
