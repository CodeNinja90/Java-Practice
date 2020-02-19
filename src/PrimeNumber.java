package PACKAGE_NAME;
import java.util.Scanner;


public class PrimeNumber {




        public static void main(String[] args) {
            
            System.out.println("Enter the number");
            int number = new Scanner(System.in).nextInt();

            boolean primeFlag = true;

            if (number <=1 ){

                System.out.println("1 is neither prime nor composit");

            }

            for (int i=2;i<=(number/2);i++){ // sqr(num) can also be used to increase efficiency

                if (number%2 == 0){

                    primeFlag = false;
                    break;

                }
            }

            if(primeFlag == true){

                System.out.println("The number is a prime numbers");

            }
            else{

                System.out.println("The number is not a prime number");
                
            }



        }


    


}
