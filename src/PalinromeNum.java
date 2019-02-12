import java.util.Scanner;

public class PalinromeNum {

    public static void main(String[] args) {

        int num = 0, revNum =0, pop = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");

        num = scan.nextInt();

        int x = num;

        while (x!= 0){

            revNum = revNum * 10;
            revNum = revNum + (x % 10);
            x = x/10;

            }

            if (num == revNum){

                System.out.println("The number is a palindrome");


            }

            else {
            System.out.println("The number is not a palindrome");
        }


    }
}
