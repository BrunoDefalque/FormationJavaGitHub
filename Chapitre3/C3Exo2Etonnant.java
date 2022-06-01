import java.util.Scanner;

/**
 * C3Exo2Etonnant
 */
public class C3Exo2Etonnant {

	static void Phrase(String _string) {
		System.out.println(_string + " !!!");
	}

	public static void main(String[] args) {

		String string = "Arrête-moi si tu peux";
		Phrase("Tu n'arrêtes pas de faire des conneries");
		Phrase(string);

		System.out.println("Tapez une phrase");

		Scanner input = new Scanner(System.in);

		Phrase(input.nextLine());

		System.out.println(" taper une phrase étonnante et je vous la rendrai");

		String chaineEtonnante = input.nextLine();

		Phrase(chaineEtonnante);

		input.close();
		}
}