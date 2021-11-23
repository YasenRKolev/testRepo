package longest_common_sequence;

public class Main {
	
	private static String SEQUENCE1 = "AGGTABD";
	private static String SEQUENCE2 = "GXTXAYBD";
	private static char[] SEQUENCE_CHARS1 = SEQUENCE1.toCharArray();
	private static char[] SEQUENCE_CHARS2 = SEQUENCE2.toCharArray();	
	
	public static void main(String[] args) {
		System.out.println("START");
	
		int result = getLenghtOfLongestSubsequence(SEQUENCE1.length()-1, SEQUENCE2.length()-1);
		
		System.out.println("END, final answer is " + result);
	}
	
	private static int getLenghtOfLongestSubsequence(int index1, int index2) {
		if (index1 < 0 || index2 < 0) {
			return 0;
		}
		if (SEQUENCE_CHARS1[index1] == SEQUENCE_CHARS2[index2]) {
			return 1 + getLenghtOfLongestSubsequence(index1-1, index2-1);
		}
		return Math.max(getLenghtOfLongestSubsequence(index1-1, index2), getLenghtOfLongestSubsequence(index1, index2-1));
	}
	

}
