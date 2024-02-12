package src.basics_05;

public class Lab088_FizzBuzz_Program {
    public static void main(String[] args) {
        //Fizzbuzz problem
        // program that print number from 1 to 100
        // for multiple of 3 print "Fizz" instead of number
        // for multiple of 5 print "Buzz" instead of number
        // for multiple of 3 & 5 print "FizzBuzz" instead of number

        for (int i = 1 ; i <= 100 ; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }else if (i%3 == 0 ){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        } System.out.println("-- End of program -- ");
    }
}
