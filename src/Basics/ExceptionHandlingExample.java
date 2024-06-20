package Basics;

class AvinashException extends Exception{
    public AvinashException(){
        System.out.println("Avinash Exception");
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            if(i == 0) throw new AvinashException();
            j = 18/i;
        }
        catch (AvinashException e) {
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception" + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException" + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception" + e.getMessage());
        }
        finally {
            System.out.println("Finally");
        }

        System.out.println(j);
    }
}
