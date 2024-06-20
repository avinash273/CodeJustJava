package Basics;

class Adder{
    int x;
    int y;

    public static int add(int x, int y){
       int z = x + y;
       return z;
    }

}


public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer test = new StringBuffer();
        test.append("Avinash");

        Adder adder = new Adder();
        adder.x = 1;
        adder.y = 2;


        System.out.println(test.append(" shanker").delete(0,5));
        System.out.println(Adder.add(3,7));
    }
}
