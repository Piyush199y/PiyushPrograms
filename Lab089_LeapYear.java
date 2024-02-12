package src.basics_05;

/**
 * Author - Piyush
 *
 * Leap year program
 *
 */
public class Lab089_LeapYear {
    public static void main (String[] args){

        int year = 1900;

        if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            System.out.println("This is a leap year");
        }else {
            System.out.println("This is not a leap year");
        }

        System.out.println(" -- End of program -- ");

    }
}
