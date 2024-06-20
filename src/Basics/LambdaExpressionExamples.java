package Basics;

@FunctionalInterface
interface Apps{
    int addNumbers(int a, int b);
}

//LambdaExpression works only with @FunctionalInterface. Java 8 feature

public class LambdaExpressionExamples {
    public static void main(String[] args) {
        Apps addNumber = (a,b) -> (2 * a + 2 * b);
        System.out.println(addNumber.addNumbers(4,5));
    }
}
