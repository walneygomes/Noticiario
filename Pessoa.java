import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int idade;
	private ArrayList<String> textoNoticianew = new ArrayList<String>();

	public void notificar(String texto)

	{
		this.textoNoticianew.add(nome);

	}

	public void sizeNotifica() {
		System.out.print("Voce tem " + this.textoNoticianew.size());
	}

	public void ler(int pos) {

		System.out.print("Lendo " + this.textoNoticianew.get(pos + 1));

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public ArrayList<String> getTextoNoticianew() {
		return textoNoticianew;
	}

	public void setTextoNoticianew(ArrayList<String> textoNoticianew) {
		this.textoNoticianew = textoNoticianew;
	}
	

}
