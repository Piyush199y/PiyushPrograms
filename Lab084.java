package src.basics_05;

import java.util.Scanner;

/**
 *  Author - Piyush
 *  Factorial of a number program
 */
public class Lab084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        int input = sc.nextInt();

        long l = 1;

        int n = 1;
        while(n<=input){
            l = l * n;
            n++;
        }
        System.out.println("Factorial for your input is = " + l);
        sc.close();


    }
}
