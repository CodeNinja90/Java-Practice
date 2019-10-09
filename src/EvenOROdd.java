import java.util.Scanner;

public class EvenOROdd {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("Please enter the number");


        int a = sca.nextInt();


        if (a%2 == 0){

            System.out.println("Its even");
        }
        else{

            System.out.println("Its Odd");
        }
    }
}
