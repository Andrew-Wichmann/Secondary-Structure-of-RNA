package RNAStructureFinder;

public class SequenceFactory {

	public static Sequence create_Sequence(String input_String) {
		// TODO Auto-generated method stub
		if(input_String.isEmpty()){
			return null;
		} else return new Sequence(input_String);
	}

}
