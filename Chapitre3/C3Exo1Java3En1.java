import java.util.Scanner;

/**
 * C3Exo1Java3En1
 */
public class C3Exo1Java3En1 {

	static void TroisEnUn() {
		System.out.println("Hello World");

		Scanner input = new Scanner(System.in);
		System.out.println("Quel est votre animal préféré ?");
		String animaleFavorite =input.nextLine();
		input.close();

		System.out.println("Votre animal favori est " + animaleFavorite);

		
		System.out.println("\007");
	}

	public static void main(String[] args) {
		TroisEnUn();
	}
}