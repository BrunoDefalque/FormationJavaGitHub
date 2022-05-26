import java.util.Scanner;

/**
 * RenvoiUneChaine
 */
public class RenvoiUneChaine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quel est ta voiture préférée ?");
		String autoFavorite = input.nextLine();
		input.close();
	
	System.out.println("Ta voiture favorite est une " + autoFavorite);
	}
}