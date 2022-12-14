import Leetcode.*;

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

        /**
         * zigzagConversionMain
         * https://leetcode.com/problems/zigzag-conversion/
         * Input: s = "PAYPALISHIRING", numRows = 4
         * Output: "PINALSIGYAHRPI"
         * Explanation:
         * P     I    N
         * A   L S  I G
         * Y A   H R
         * P     I
         */
        zigzagConversionMain zigzagConversionVar = new zigzagConversionMain();
        System.out.println("5. zigzagConversionMain: " + zigzagConversionVar.convert("PAYPALISHIRING", 4));

        /**
         * intToRomanMain
         * https://leetcode.com/problems/integer-to-roman/
         * Input: num = 58
         * Output: "LVIII"
         * Explanation: L = 50, V = 5, III = 3.
         */
        intToRomanMain intToRomanVar = new intToRomanMain();
        System.out.println("6. intToRoman: " + intToRomanVar.intToRoman(58));

        /**
         * containerWithMostWaterMain Test
         * https://leetcode.com/problems/container-with-most-water/
         * Input: height = [1,8,6,2,5,4,8,3,7]
         * Output: 49
         * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
         * In this case, the max area of water (blue section) the container can contain is 49.
         */
        containerWithMostWaterMain containerWithMostWaterVar = new containerWithMostWaterMain();
        System.out.println("7. containerWithMostWaterMain: "+ containerWithMostWaterVar.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));

        /**
         * threeSumClosest
         * https://leetcode.com/problems/3sum-closest/
         * Input: nums = [-1,2,1,-4], target = 1
         * Output: 2
         * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
         */
        threeSumClosestMain threeSumClosestVar = new threeSumClosestMain();
        System.out.println("8. threeSumClosestMain: " + threeSumClosestVar.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));

        /**
         * letterCombinationsMain
         * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
         * Input: digits = "23"
         * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
         */
        letterCombinationsMain letterCombinationsVar = new letterCombinationsMain();
        System.out.println("9. letterCombinationsMain: "+ letterCombinationsVar.letterCombinations("23"));

    }
}
