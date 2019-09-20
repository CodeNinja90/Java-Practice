
/*

Prints characters and repeat count, if they repeat in a string.

 */

import java.util.*;

public class DuplicateCharCount {

    static void duplicateCounter(String s){

        HashMap <Character,Integer> baseMap = new HashMap<Character,Integer>();


        String shortString = s.replaceAll("\\s","");

        char []charArray = shortString.toCharArray();


        for(char c : charArray){

            if(baseMap.containsKey(c)){

                baseMap.put(c,baseMap.get(c)+1); // increases count if the char is already present


            }else {

                baseMap.put(c,1); // Add the char for the first time


            }

        }

        Set <Character> keySet = baseMap.keySet();

        for (char c : keySet){

            if(baseMap.get(c)>1){ // Prints character if it repeats

                System.out.println(c + "   "+baseMap.get(c));
            }



        }




    }

    public static void main(String[] args) {




        duplicateCounter("my name is naresh kumar");


        duplicateCounter("today is a glorious day");



    }
}
