import java.util.Scanner;

/**
 * RenvoiChaineAnimalFavorite
 */
public class RenvoiChaineAnimalFavorite {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" quel est ton animal préféré ?");

		String animalFavorite = scan.nextLine();
		scan.close();
		System.out.println(" ton animal préféré est " + animalFavorite);

	}
}