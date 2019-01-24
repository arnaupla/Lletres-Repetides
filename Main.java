package Paquet;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<Character> nom = new ArrayList<Character>();
		nom = createArray();
		
		checkNumbers(nom);
		
		checkVowels(nom);

	}
	
	public static List<Character> createArray() {
		
		List<Character> nom = new ArrayList<Character>();
		nom.add('A');
		nom.add('5');
		nom.add('n');
		nom.add('a');
		nom.add('u');
		
		return nom;
	}
	
	public static void checkNumbers(List<Character> nom1) {
		
		char[] numeros ={ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		for(char i : nom1) {
			for(char z: numeros) {
				if(i == z) {
					System.out.println("Els noms de persones no contenen n�meros!");
					return;
				}
			}
		}
	}
	
	public static void checkVowels(List<Character> nom1) {
			for(char i : nom1) {
				i = Character.toLowerCase(i);
					if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' ) {
						System.out.println(i + " VOCAL");
					}else {
						System.out.println(i + " CONSONANT");
					}
			}
	}
}
	
