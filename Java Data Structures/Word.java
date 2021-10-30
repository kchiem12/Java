
/*
	LAB 1 (WORDS) FOR HASHTABLES
*/

public class Word {

	private String theWord;

	//constructor
	public Word(String word) {
		theWord = word;
	}

	//getter method
	public String getValue() {
		return theWord;
	}

	//redefining the equals() method
	public boolean equals(String other) {
		return theWord.equals(other);
	}

	//the hashcode formula (vowels * num letters % 10)
	public int hashCode() {
		int vowels = 0;
		String[] temp = theWord.split("");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals("a") || temp[i].equals("i") || temp[i].equals("e") ||
			temp[i].equals("o") || temp[i].equals("u")) {
				vowels++;
			}
		}
		return (vowels * temp.length) % 10;
	}


	//toString (returns the actual word)
	public String toString() {
		return theWord;
	}




}