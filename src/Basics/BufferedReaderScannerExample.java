package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderScannerExample {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter:");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
//        System.out.println("The number1 is: " + num);
//        br.close();
//
//        //Scammer is easy

        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println("The number2 is: " + num2);
    }
}
