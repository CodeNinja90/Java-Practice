import java.util.Arrays;

public class SplitStrings {


    public static void main(String[] args) {


        String s = "My name is naresh";


        String [] sArray = s.split("\\s");

        System.out.println("Total number of words: "+sArray.length);

        for (String str: sArray){

            System.out.print(str+"------");
        }


   }
}
