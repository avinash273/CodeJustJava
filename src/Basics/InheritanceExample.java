package Basics;

class Calculator{
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

}

class AdvancedCalculator extends Calculator{
    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(Integer a, int b){
        return a / b;
    }
}

class VeryAdvancedCalculator extends Calculator{
    public double power(double a, double b){
        return Math.pow(a, b);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        AdvancedCalculator calculator = new AdvancedCalculator();
        VeryAdvancedCalculator veryCalculator = new VeryAdvancedCalculator();
        System.out.println(calculator.multiply(2, 3));
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.divide(2, 1));
        System.out.println(veryCalculator.add(2, 3));

        String number = "12";
        int numberInt = Integer.parseInt(number);
    }
}
