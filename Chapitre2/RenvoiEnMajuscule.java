import java.util.Scanner;

/**
 * RenvoiEnMajuscule
 */
public class RenvoiEnMajuscule {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(" dans quelle maison de Pouldard voudrais-tu aller ?");

		String poudlardHouse = input.nextLine();
		input.close();

		System.out.println("Tuveux aller à " + poudlardHouse.toUpperCase() + "\n" +
		"Tu es un sale moldu, les grands mages parlent couramment le Java !");
	}
}