package vowels_and_Consonants;

public class VowsAndCons {

	private String str;
	
	public VowsAndCons(String str){
		this.str = str;
	}
	public void setString(String str){
		this.str = str;
	}
	public int numVowels(){
		int count = 0;
		for(int i = 0; i < this.str.length();i++){
			if(isVowel(this.str.charAt(i)))
				count++;
		}
		return count;
	}
	public int numConsonants(){
		int count = 0;
		for(int i = 0; i < this.str.length();i++){
			if(isConsonant(this.str.charAt(i)))
				count++;
		}
		return count;
	}
	public static boolean isVowel(char ch){
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;
	}
	public static boolean isConsonant(char ch){
		if(Character.isLetter(ch) && !isVowel(ch))
			return true;
		else
			return false;
	}
}
