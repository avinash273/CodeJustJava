package Leetcode;

public class reverseIntegerMain {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            //this check is for overflow error where reverse leads to out of int range
            if ((newResult) / 10 != result) return 0;
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}
