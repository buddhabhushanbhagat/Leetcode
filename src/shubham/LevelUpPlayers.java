package shubham;

import java.util.Arrays;

public class LevelUpPlayers {
    public static int countLevelUpPlayers(int cutoffRank, int[] scores) {
        // Sort the scores in descending order
        Arrays.sort(scores);
        
        int start = 0;
        int end = scores.length - 1;
        while (start < end) {
            int temp = scores[start];
            scores[start] = scores[end];
            scores[end] = temp;
            start++;
            end--;
        }
        // Assign ranks to players
        int[] ranks = new int[scores.length];
        ranks[0] = 1;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == scores[i - 1]) {
                ranks[i] = ranks[i - 1];
            } else {
                ranks[i] = i + 1;
            }
        }

        // Count the number of players who can level up
        int numLevelUp = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 0 && ranks[i] <= cutoffRank) {
                numLevelUp++;
            }
        }
        return numLevelUp;
    }

//    // Helper method to reverse an array
//    private static void reverseArray(int[] arr) {
//    	   int start = 0;
//           int end = arr.length - 1;
//           while (start < end) {
//               int temp = arr[start];
//               arr[start] = arr[end];
//               arr[end] = temp;
//               start++;
//               end--;
//           }
//    }

    public static void main(String[] args) {
        int cutoffRank = 8;
        int[] scores = {10,50,51,23,25,37,65,5,98,93 };
        System.out.println(countLevelUpPlayers(cutoffRank, scores)); // Output: 4
    }
}
