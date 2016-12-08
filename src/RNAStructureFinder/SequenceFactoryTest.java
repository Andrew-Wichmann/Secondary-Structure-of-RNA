package RNAStructureFinder;

import static org.junit.Assert.*;

import org.junit.Test;

public class SequenceFactoryTest {
	
	//An empty string passed in to the create_sequence function should return a null object
	//This is used to determine success or failure of the created object
	@Test
	public void test_that_creates_sequence_returns_null_on_empty_string_passage() {
		assertNull(SequenceFactory.create_Sequence(""));
	}
	
	//A string with characters outside of the alphabet passed in to the create_sequence function
	//should return a null object. This is used to determine success or failure of the created object
	@Test
	public void test_that_create_sequence_returns_null_on_invalid_sequence_passage(){
		assertNull(SequenceFactory.create_Sequence("z"));
		assertNull(SequenceFactory.create_Sequence("az"));
		assertNull(SequenceFactory.create_Sequence("aucgcgcugaugcguagux"));
		assertNull(SequenceFactory.create_Sequence("xaucgcgcugaugcguagu"));
		assertNull(SequenceFactory.create_Sequence("xaucgcgcugtugcguagu"));
		assertNull(SequenceFactory.create_Sequence("xaucgcgcugtugcttttttguagu"));
	}
	
	//A string with characters all within the alphabet passed in to the create_sequence function should
	//return a sequence object that is not null. This object will be passes back to the Starter class.
	@Test
	public void test_that_create_sequence_returns_a_nonnull_sequence_on_valid_passage(){
		assertNotNull(SequenceFactory.create_Sequence("a"));
		assertNotNull(SequenceFactory.create_Sequence("au"));
		assertNotNull(SequenceFactory.create_Sequence("aucgcgcugaugcguagu"));
		assertNotNull(SequenceFactory.create_Sequence("aucgcgcugaucugcguagu"));
		assertNotNull(SequenceFactory.create_Sequence("aucgcgcugugcguagu"));
		assertNotNull(SequenceFactory.create_Sequence("aucgcgcugugugugugugugguuggucguacgaucgaucgaucucgaucgaucgucuagu"));
	}
	
	//The sequence returned by the create_sequence function should be the same string assuming that
	//the sequence is valid.
	@Test
	public void test_that_the_create_sequence_returns_a_sequence_with_no_base_pairs(){
		String valid_sequence = "aucguacguacguagucgaucguggcaacgaucgau";
		RNAsequence primary_sequence = SequenceFactory.create_Sequence(valid_sequence);
		
		//Check that they're the same length and that all the characters match
		assertEquals(valid_sequence.length(), primary_sequence.sequence.length());
		for(int i = 0; i < valid_sequence.length(); i++){
			assertEquals(valid_sequence.charAt(i), primary_sequence.sequence.charAt(i));
		}
	}

	//The sequence returned by the create_sequence function should have no base pairs.
	@Test
	public void test_that_the_create_sequence_returns_a_pair_free_sequence(){
		String valid_sequence = "aucguacguacguagucgaucguggcaacgaucgau";
		RNAsequence primary_sequence = SequenceFactory.create_Sequence(valid_sequence);
		
		//Check that each basepair element is 0 (not paired)
		for(int i = 0; i<primary_sequence.basePairs.length; i++){
			assertEquals(0, primary_sequence.basePairs[i]);
		}
	}
}
