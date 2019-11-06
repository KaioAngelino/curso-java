import java.util.Scanner;
public class Navegar{

	public static void main(String args[]){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Em qual página deseja navegar?.\n - Página inicial\n - Portfólio\n - Fale Conosco");
		
		String op = leitor.nextLine();		
		
		switch(op){
			
			case "pagina inicial":
				System.out.println("Você está na página inicial"); 
			break;
			
			case "portfolio": 
				System.out.println("Aproveite o nosso portifolio");

			break; 			

			case "fale conosco":
				System.out.println("Nosso contato é: 99999-9999"); 
			break;
		
			default: System.out.println("erro 404. Página não encontrada.");	
		
		}		
		
	}

}
