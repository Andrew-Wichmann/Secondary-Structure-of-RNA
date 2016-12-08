package RNAStructureFinder;

public class SecondaryStructureFinder {

	private static int[][] memo;
	private static RNAsequence primarySequence;
	
	public SecondaryStructureFinder(){
		
	}
	
	public static RNAsequence findSecStructure(RNAsequence Sequence) {
		primarySequence = Sequence;
		
		int squenceLength = primarySequence.length();
		memo = new int[squenceLength][squenceLength];
		for(int k = 4; k < squenceLength; k++){
			for(int i = 0; i < squenceLength-k; i++){
				int j = i + k;
				compute_M(i,j);
			}
		}
		System.out.println(memo[0][squenceLength-1]);
		return null;
	}

	private static void compute_M(int i, int j) {
		if(j-i <= 4){
			memo[i][j] = 0;
		}else{
			if(primarySequence.is_a_WC_base_pair(i,j)){
				memo[i][j] = Math.max(1 + memo[i+1][j-1], memo[i][j-1]);
			} else memo[i][j] = memo[i][j-1];
		}
	}

}
