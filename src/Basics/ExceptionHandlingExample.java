package Basics;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18/i;
        }
        catch (Exception e){
            System.out.println("Arithmetic Exception");
        }

        System.out.println(j);
    }
}
