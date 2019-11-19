package joaomcode.desafio01;

public class TesteEscola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endereco e1 = new Endereco("123", "Rua das Maravilhas", "NeverLand");
		Aluno a1 = new Aluno("Java", "Tarde", "João", "123.234.345-45", "999012345", e1);

		// Imprime os atributos da instancia "a1"
		System.out.println("----------------------");
		System.out.println("Bem vindo " + a1.getNome() + ".\nAbaixo seguem seus dados\n");
		System.out.println("Curso: " + a1.getCurso());
		System.out.println("Turno: " + a1.getTurno());
		System.out.println("CPF:" + a1.getCpf());
		System.out.println("Telefone: " + a1.getTelefone());
		System.out.println("Seu endereço é " + a1.endereco.getRua() + " Nº " + a1.endereco.getNumero());
		System.out.println("Localizado no município de " + a1.endereco.getCidade());

	}

}
