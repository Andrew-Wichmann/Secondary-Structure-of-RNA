package RNAStructureFinder;

public class SequenceFactory {

	private static char[] alphabet = new char[]{'a','u','g','c'};
	private char[][] basepairs= new char[][]{{'a','u'}, {'u','a'}, {'g','c'}, {'c','g'}};
	
	public static Sequence create_Sequence(String input_String) {
		// TODO Auto-generated method stub
		if(input_String.isEmpty() || !is_valid(input_String)){
			return null;
		} else return new Sequence(input_String);
	}
	
	//Input a sequence to check its validity within the defined alphabet
	private static boolean is_valid(String input){
		//Loop through each element in the string
		for(int i = 0; i < input.length(); i++){
			
			if(!within_alphabet(input.charAt(i))){
				//if even one is not in the alphabet, the whole sequence fails
				return false;
			}
			
		}
		//if all are within the alphabet, it's valid
		return true;
	}
	
	//Checks one character against each character in the alphabet
	private static boolean within_alphabet(char element){
		for(int i = 0; i < alphabet.length; i++){
			if(element == alphabet[i]){
				//when one matches, the character is within the alphabet
				return true;
			}
		}
		
		//if none match, the character is not within the alphabet
		return false;
	}

}
