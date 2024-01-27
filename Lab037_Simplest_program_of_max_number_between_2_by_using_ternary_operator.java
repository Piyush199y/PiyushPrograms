package src.basics_02;

public class Lab037_Simplest_program_of_max_number_between_2_by_using_ternary_operator {
    public static void main(String[] args){
        //Ternary operator - Condition based

        //int a = condition ? If this is true do this print : If false do this do not print

        //MAX of two numbers?

        int a = 30;
        int b = 20;

        int max = a < b ? b : a ;
        int min = a < b ? a : b ;

        System.out.println(max);
        System.out.println(min);


    }
}
