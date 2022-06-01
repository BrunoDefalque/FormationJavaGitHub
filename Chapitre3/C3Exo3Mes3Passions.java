/**
 * C3Exo3Mes3Passions
 */
public class C3Exo3Mes3Passions {

	static void TroisFavoris(String _firstPassion, String _secondPassion, String _thirdPassion) {
		System.out.println("Mes 3 plus grandes passions sont :\n" + "1) " + _firstPassion + "\n2) " + _secondPassion + "\n3) " + _thirdPassion);
	}

	public static void main(String[] args) {

		String firstPassion = "Mes filles";

		String secondPassion = "Informatique";

		String thirdPassion = "Les Filles";

		TroisFavoris(firstPassion, secondPassion, thirdPassion);
		
	}
}