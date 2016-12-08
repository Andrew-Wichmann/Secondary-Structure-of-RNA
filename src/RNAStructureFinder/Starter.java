package RNAStructureFinder;
import java.io.*;
import java.util.*;

public class Starter {

	private static String input_String;
	private static Sequence primarySequence;
	private static Sequence secondarySequence;
	private SecondaryStructureFinder secStructureFinder;
	private SecondaryStructureDrawer secStructureDrawer;
	private static Scanner user_input = new Scanner(System.in);
	
	public static void main(String[] args) {
		//First, repeatedly ask for a valid sequence until on is given.
		while(primarySequence == null){
			ask_for_sequence();
		}
		
		
		//Second, find the secondary sequence
		secondarySequence = SecondaryStructureFinder.findSecStructure(primarySequence);
		
		//Finally, draw the sequence
		SecondaryStructureDrawer.drawSecStructure(secondarySequence);
	}
	
	private static void ask_for_sequence(){
		//Obtain input from user
		System.out.println("Please enter the RNA sequence without spaces according to the alphabet. [a,c,g,u]");
		input_String = user_input.nextLine();

		//Get a sequence object from the sequence factory
		primarySequence = SequenceFactory.create_Sequence(input_String);
	}

}
