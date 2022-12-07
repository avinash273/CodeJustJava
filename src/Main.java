import Leetcode.reverseIntegerMain;
import Leetcode.twoSumMain;
import Leetcode.lengthOfLongestSubstringMain;
import Leetcode.zigzagConversionMain;

public class Main {

    public static void main(String[] args) {
        /**
         * Main function used to call all program
         * -Avinash Shanker
         */

        System.out.println("Main function used to call all program \n");

        /**
         * https://leetcode.com/problems/two-sum/
         * Input: nums = [2,7,11,15], target = 9
         * Output: [0,1]
         * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        twoSumMain twoSumVar = new twoSumMain();
        int[] output = twoSumVar.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("1. twoSum: [" + output[0] + "," + output[1] + "]");

        /**
         * https://leetcode.com/problems/longest-substring-without-repeating-characters/
         * Input: s = "abcabcbb"
         * Output: 3
         * Explanation: The answer is "abc", with the length of 3.
         */
        lengthOfLongestSubstringMain lengthOfLongestSubstringVar = new lengthOfLongestSubstringMain();
        System.out.println("2. lengthOfLongestSubstringMain: " + lengthOfLongestSubstringVar.lengthOfLongestSubstring("abcabcbb"));

        /**
         * https://leetcode.com/problems/zigzag-conversion/
         * Input: s = "PAYPALISHIRING", numRows = 3
         * Output: "PAHNAPLSIIGYIR"
         */
        zigzagConversionMain zigzagConversionMainVar = new zigzagConversionMain();
        System.out.println("3. zigzagConversionMain: " + zigzagConversionMainVar.convert("PAYPALISHIRING", 3));

        /**
         * https://leetcode.com/problems/reverse-integer/
         * Input: x = 123
         * Output: 321
         */
        reverseIntegerMain reverseIntegerVar = new reverseIntegerMain();
        System.out.println("4. reverseInteger: " + reverseIntegerVar.reverse(321));
    }
}
