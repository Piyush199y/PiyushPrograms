package src.basics_05;

import java.util.Scanner;

/**
 * Author - Piyush
 * Prime number checker program
 *
 */
public class Lab083 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number, I will tell you if its a prime number or not");
        int input = sc.nextInt();

        if(input >= 1 && input%2 != 0 && input%input == 0){
            System.out.println(input + " Its a prime number");

            }else{
            System.out.println(input + " Its not a prime number");

        }
        sc.close();
        System.out.println(" -- End of the program -- ");

            }
        }

