
public class Main {

	public static void main(String[] args) {
		
		String message = "Good morning!";
		System.out.println(message);
		
		System.out.println("number of letters: " + message.length());		// finds the length of the sentence
		System.out.println("4th element: " + message.charAt(3));			// gives the character in the wanted index
		System.out.println(message.concat(" Have a nice day."));			// concatenates texts in a new string
		
		System.out.println(message.startsWith("G"));
		System.out.println(message.endsWith("."));				// returns true or false
		
		char[] characters = new char[9];
		message.getChars(0, 9, characters, 0);					// assigns the letters between the entered indexes to the new array
		System.out.println(characters);
		
		System.out.println(message.indexOf("o"));				// returns the index of the letter , starting counting from the left
		System.out.println(message.lastIndexOf("o"));			// returns the index of the letter , starting counting from the right
		
		String newMessage = message.replace( ' ' , '-');		// replaces entered characters
		System.out.println(newMessage);
		
		System.out.println(message.substring(5));				// cuts the string between the entered indexes
		System.out.println(message.substring(5 , 12));
		
		for(String word:message.split(" ")) {					// cuts the string up to the entered character
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());				// converts all letters to lowercase
		System.out.println(message.toUpperCase());				// converts all letters to uppercase
		
		System.out.println(message.trim());						// removes spaces at the beginning and end of the string

	}

}
