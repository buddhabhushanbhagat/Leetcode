package shubham;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Amdocs {
	public static int numPlayers(int k, List<Integer> scores) {
		// Sort the scores in descending order
		Collections.sort(scores);
		int start = 0;
		int end = scores.size() - 1;
		while (start < end) {
			int temp = scores.get(start);
			scores.set(start, scores.get(end)) ;
			scores.set(end, temp) ;
			start++;
			end--;
		}

		// Initialize a map to store the frequency of each score
		Map<Integer, Integer> scoreFreq = new HashMap<>();
		for (int score : scores) {
			scoreFreq.put(score, scoreFreq.getOrDefault(score, 0) + 1);
		}

		// Initialize a map to store the ranks of each score
		Map<Integer, Integer> scoreRanks = new HashMap<>();
		int rank = 1;
		for (int score : scoreFreq.keySet()) {
			scoreRanks.put(score, rank);
			rank += scoreFreq.get(score);
		}

		// Count the number of players who can level up
		int numLevelUp = 0;
		for (int score : scores) {
			if (score > 0 && scoreRanks.get(score) <= k) {
				numLevelUp++;
			}
		}
		return numLevelUp;
	}

	public static void main(String[] args) {
		int k = 8;
		List<Integer> scores = Arrays.asList(10,50,51,23,25,37,65,5,98,93 );
		System.out.println(numPlayers(k, scores)); // Output: 4
		
//		  String[] strings = {"aab", "abc","bbb","cc"};
//		  int N = 4;
//		Source s = new Source();
//		s.countPalindromePairs(strings,N); 
	}
}
