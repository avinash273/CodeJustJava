import Leetcode.twoSumMain;

public class Main {

    public static void main(String[] args) {
        /*
          Main function used to call all programs
          -Avinash Shanker
         */

        /*
          https://leetcode.com/problems/two-sum/
         */
        twoSumMain twoSumVar = new twoSumMain();
        int[] result = twoSumVar.twoSum(new int[]{2, 7, 11, 15}, 13);
        System.out.println("twoSum [" + result[0] + "," + result[1] + "]");
    }
}
