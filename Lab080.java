package src.basics_04;

import java.util.Scanner;

public class Lab080 {
    /**
     * Author - Piyush
     * factorial of any number program
     *
     */
    public static void main(String[] args) {
        // Problem statement
        // factorial program
        // 1! - 1 * 1
        // 2! - 2 * 1
        // ...
        // 10! - 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1

        //user input = 5  --> want to print -> 120  -> using while loop

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int input = sc.nextInt();

        long l = 1;

        int n = 1;
        while(n<=input){
            l = l * n;
            n++;
        }
        System.out.println("Your factorial value is = " + l);

        sc.close();

    }
}
