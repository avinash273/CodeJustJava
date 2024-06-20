package Basics;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer test = new StringBuffer();
        test.append("Avinash");

        System.out.println(test.append(" shanker").delete(0,5));
    }
}
