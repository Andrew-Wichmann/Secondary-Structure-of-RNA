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
}
