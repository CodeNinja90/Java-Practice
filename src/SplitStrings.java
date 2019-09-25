
/**
 *
 * Additional ways to split strings
 * https://howtodoinjava.com/java/string/4-ways-to-split-tokenize-strings-in-java/


 */


import java.util.Arrays;
import java.util.StringTokenizer;

public class SplitStrings {


    public static void main(String[] args) {


        String s = "My name is naresh";

        // First way

        System.out.println("Using regex");


        String [] sArray = s.split("\\s");

        System.out.println("Total number of words: "+sArray.length);

        for (String str: sArray){

            System.out.println(str);

        }

        // Second Way

        System.out.println("Using String Tokenizer");

        StringTokenizer strTok = new StringTokenizer(s);

        while (strTok.hasMoreElements()){
            System.out.println(strTok.nextToken());
        }

        // Ref docs for more ways





   }
}
