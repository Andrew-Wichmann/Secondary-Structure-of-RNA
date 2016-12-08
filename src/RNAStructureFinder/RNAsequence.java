package RNAStructureFinder;

public class RNAsequence implements SequenceWrapper{
	protected String sequence;
	protected int basePairs[];
	private char[][] basepairsoptions= new char[][]{{'a','u'}, {'u','a'}, {'g','c'}, {'c','g'}};
	private static char[] alphabet = new char[]{'a','u','g','c'};

	public RNAsequence(){
	}
	
	public RNAsequence(String string){
		this.sequence = string;
		basePairs = new int[string.length()];
	}
	
	public char[] get_alphabet(){
		return alphabet;
	}
	
	public int length(){
		return sequence.length();
	}
	
	public boolean is_a_WC_base_pair(int i, int j){
		//loop through base pair options until found
		int count = 0;
		while(sequence.charAt(i) != basepairsoptions[count][0]){
			if(Character.valueOf(sequence.charAt(i)).compareTo(sequence.charAt(j)) == 0){
				return true;
			} else return false;
		}
		return false;
	}
}
