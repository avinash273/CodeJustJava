package Basics;

interface  A{
    int a = 6;
    void show();
}

interface  B{
    void showAgain();
}

interface  D{
    void showAgainAgain();
}

class C implements A, B, D{
    public void show(){
        System.out.println("B");
    }

    public void showAgain() {

    }


    public void showAgainAgain() {

    }
}

public class InterfaceExample {
}
