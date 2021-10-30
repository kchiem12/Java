import static java.lang.System.*;

public class RomanNumeral implements Comparable<RomanNumeral>{

	private Integer number;
	private String roman;

	private final static int[] NUMBERS = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	private final static String[] LETTERS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str) {
		roman = str;
		char[] temp = roman.toCharArray();
		Integer num = 0;
		for (char c : temp) {
			int temp1 = 0;
			for (int i = 0; i < LETTERS.length; i++) {
				if (Character.toString(c).equals(LETTERS[i])) {
					temp1 = i;
					break;
				}
			}
			num += NUMBERS[temp1];
		}
		number = num;
	}

	public RomanNumeral(Integer orig) {
		number = orig;
		Integer temp = number;
		while (temp != 0) {
			int temp1 = 0;
			for (int i = 0; i < NUMBERS.length; i++) {
				if (temp < NUMBERS[i]) {
					temp1 = i;
					break;
				}
			}
			roman = roman + LETTERS[temp1];
			temp = temp - NUMBERS[temp1];
		}
	}

	public void setNumber(Integer num) {
		number = num;
	}

	public void setRoman(String str) {
		roman = str;
	}

	public Integer getNumber() {
		return number;
	}

	public String getRoman() {
		return roman;
	}

	public int compareTo(RomanNumeral r) {
		return number - r.getNumber();
	}

	public boolean equals(RomanNumeral r) {
		if (compareTo(r) != 0) 
			return false;
		return true;
	}

	public String toString() {
		return roman;
	}



}