package src.basics_02;

import java.util.Scanner;

    public class Lab048 {
    public static void main(String[] args) {

        // Take two input and show the max number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the vlaue of B");
        int b = sc.nextInt();

        if (a>b){
            System.out.println("A is greatest number");
        } else {
            System.out.println("B is the greatest number");
        }



    }
}
