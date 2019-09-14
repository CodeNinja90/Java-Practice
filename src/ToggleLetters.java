

import java.util.*;


public class ToggleLetters {


    public static void main(String[] args) {



        String str = "mY nAMe is kHaN";

        String togWord ="";



        String[] words = str.split("\\s");


        for (String w :words){

            char []cha = w.toCharArray();



            for (char c: cha){

                if (Character.isUpperCase(c)){


                    togWord += Character.toLowerCase(c);
                }

                else{

                    togWord += Character.toUpperCase(c);

                }


            }

            togWord += " ";


        }

        System.out.println(togWord.trim());


    }
}
