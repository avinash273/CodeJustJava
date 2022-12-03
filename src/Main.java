import Leetcode.twoSumMain;
import Leetcode.lengthOfLongestSubstringMain;

public class Main {

    public static void main(String[] args) {
        /**
         * Main function used to call all program
         * -Avinash Shanker
         */

        /**
         * https://leetcode.com/problems/two-sum/
         */
        twoSumMain twoSumVar = new twoSumMain();
        int[] output = twoSumVar.twoSum(new int[]{2, 7, 11, 15}, 13);
        System.out.println("twoSum [" + output[0] + "," + output[1] + "]");

        /**
         * https://leetcode.com/problems/longest-substring-without-repeating-characters/
         */
        lengthOfLongestSubstringMain lengthOfLongestSubstringVar = new lengthOfLongestSubstringMain();
        System.out.println("lengthOfLongestSubstringMain: " + lengthOfLongestSubstringVar.lengthOfLongestSubstring("abcabcbb"));
    }
}
