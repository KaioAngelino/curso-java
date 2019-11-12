package joaomcode.aula015;

public class Galinha {
	public String nome;
	public int ovos;
	public static int ovosGranja;
	
	public Galinha(String nome) {
		this.nome = nome;
	}
	
	public void BotarOvos() {
		this.ovos++;
		ovosGranja++;
	}
	
	public int getOvosGranja() {
		return ovosGranja;
	}
	
}
