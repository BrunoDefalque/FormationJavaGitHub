/**
 * C3Exo5AvantGoutFactorisation
 */
public class C3Exo5AvantGoutFactorisation {
/*
	static void Calcul(int _number1, int _number2) {

		int resultSoust = _number1 - _number2;
		int resultAdd = _number1 + _number2;
		System.out.println("Le résultat de " + _number1 + " + " + _number2 + " = " + resultAdd);
		System.out.println("Le résultat de " + _number1 + " - " + _number2 + " = " + resultSoust);
	}


	public static void main(String[] args) {

		int number1 = 8;

		int number2 = 4;
		Calcul(number1, number2);
	}

	*/

	static void Addition (int _number1, int _number2) {
		int _result = _number1 + _number2;

		System.out.println("Le résultat de " + _number1 + " + " + _number2 + " = " + _result);

	}

	static void Soustraction (int _number1, int _number2) {
		int _result = _number1 - _number2;

		System.out.println("Le résultat de " + _number1 + " - " + _number2 + " = " + _result);

	}

	static void DeuxEnUne (int _number1, int _number2) {
		Addition(_number1, _number2);

		Soustraction(_number1, _number2);
	}

	public static void main(String[] args) {
		int number1 = 100;

		int number2 = 20;
		Addition(number1, number2);

		Soustraction(number1, number2);

		DeuxEnUne(number1, number2);
	}

}