package RNAStructureFinder;

public class Sequence {
	String sequence;
	int basePairs[];
	public Sequence(String string){
		this.sequence = string;
		basePairs = new int[string.length()];
	}
}
