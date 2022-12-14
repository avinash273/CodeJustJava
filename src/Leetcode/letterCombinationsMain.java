package Leetcode;

import java.util.LinkedList;
import java.util.List;

public class letterCombinationsMain {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> queue = new LinkedList<>();
        if (digits.length() == 0) return queue;
        queue.add("");

        String mapping[] = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (queue.peek().length() == i) {
                String permutation = queue.remove();
                for (char c : mapping[index].toCharArray()) {
                    queue.add(permutation + c);
                }
            }
        }
        return queue;
    }
}
