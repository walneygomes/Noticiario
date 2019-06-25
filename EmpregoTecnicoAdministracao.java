import java.util.ArrayList;

public class EmpregoTecnicoAdministracao implements NoticiaEmprego {
	ArrayList<Pessoa> assinantes = new ArrayList<Pessoa>();

	private static final int IDADE_MAX = 18;

	@Override
	public void cadastrarPessoa(Pessoa pessoa) {
		if (pessoa.getIdade() > IDADE_MAX) {
			assinantes.add(pessoa);
		} else {
			System.err.print("´Pessoa maiores de:" + IDADE_MAX + "Permitida");
		}
	}

	@Override
	public void notificaPessoa(String texto) {
		if (texto == null) {
			notificaPessoa("<Voce foi notificado porque embreve estaremos com oportunidades de vagas>");
		} 
		else {
			for (Pessoa p : assinantes) {

				p.notificar(texto);
				System.out.print("Notificado para" + p.getNome());
				}
		}

	}

}
