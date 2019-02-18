
import java.util.Scanner;

public class RangeOfIntegers {





        public static void main(String[] args) {


            Scanner s = new Scanner(System.in);

            // Get L and R from the input
            int L = s.nextInt();
            int R = s.nextInt();

            // Write here the logic to print all integers between L and R

            int min, max;

            if (L<=R){

                min = L;
                max = R;
            }

            else{

                min = R;
                max = L;

            }


            for (int i = min; i <= max; i++ ){

                System.out.println(i);
            }



            s.close();
        }

}
