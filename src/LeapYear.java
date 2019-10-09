
import java.util.Scanner;
public class LeapYear {

    public LeapYear() {
    }

    public static void main(String[] args) {

        int year;



        while(1>0) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the year");


            year = scan.nextInt();

            // For leap year it should be div by 4 except centuries (years ending is 00)
            // Centuries must be divisible by 400

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {


                System.out.println("The year is a leap year");
            } else {

                System.out.println("It's not a leap year");
            }


        }

        }


    }

