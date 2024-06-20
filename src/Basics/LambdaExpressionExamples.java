package Basics;

@FunctionalInterface
interface Apps{
    void makeCall(int i);
}

public class LambdaExpressionExamples {
    public static void main(String[] args) {
        Apps app = (int i) -> System.out.println("Hello World" + i);
        app.makeCall(7);
    }
}
