/**
 * C3Exo4ParDefautNuls
 */
public class C3Exo4ParDefautNuls {

	static void CompetenceInfoJava(String _infoCompetence, String _javaCompetence = "vous n'avez jamais fait de java, vous êtes un gros nul !") {
		System.out.println(" vos compétences en informatique sont " + _infoCompetence + "\nVos compétences en Java sont" + _javaCompetence);
	}

	public static void main(String[] args) {
		String infoCompetence = "Faible";

		String javaCompetence = "Bonne";

		CompetenceInfoJava(infoCompetence, javaCompetence);


	}
}