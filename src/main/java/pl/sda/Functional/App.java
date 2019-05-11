package pl.sda.Functional;

public class App {
	public static void main(String[] args) {
		// JAVA 8 - dodanie Interfejsów Funkcyjnych Prykład ponizej:
		//uzycie interfejsu funkcyjnego (implementacja interfejsu za każdym razem)
		//jezeli dodaje adnotacje FunctionalInterfajse w interfejsie  musi być tylko 1 metoda w tym interfejsie tylko wtedy to bedzie działać
		// w przypadku interfejsów z więcej niz jedną metodą - NIE MOŻNA UŻYC adnotacji FunctionalInterface w interfejsie.
		//aby interfej wiedzial ze w przypadku odowlywanai się do interfejsu za pommocą lambd wiedział do jakiej metody sie odwolac
		// lambdy również zostały dodane w JAVA 8
		MathOperation addition = (x,y) -> x+y;

		MathOperation substraction = (x,y) -> x-y;

		MathOperation multipation = (x,y) -> x*y;

		MathOperation division = (x,y) -> x/y;
	}
}
