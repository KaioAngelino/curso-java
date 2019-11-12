package joaomcode.aula015;

public class TestaGalinha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Galinha g1 = new Galinha("Gertrudes");
		Galinha g2 = new Galinha("Pintadinha");
		
		g1.BotarOvos();
		g1.BotarOvos();
		g2.BotarOvos();
		g2.BotarOvos();
		g2.BotarOvos();
		System.out.println(g2.getOvosGranja());

	}

}
