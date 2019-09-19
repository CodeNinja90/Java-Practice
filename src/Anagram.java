import java.util.*;


public class Anagram {

    static void isAnagram(String str1, String str2){


        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");

        boolean status = true;

        if(s1.length() != s2.length()){

            status = false;


        }else {


            char[] ca1 = s1.toLowerCase().toCharArray();
            char[] ca2 = s2.toLowerCase().toCharArray();

            Arrays.sort(ca1);

            Arrays.sort(ca2);




            status = Arrays.equals(ca1,ca2);




        }

        if (status){

            System.out.println(str1+" And "+str2+" are a anagram");
        }
        else
        {
            System.out.println(str1+" And "+str2+" are not a anagram");

        }





    }


    public static void main(String[] args) {

        isAnagram("keep","peek");

        isAnagram("Naresh","kumar");

        isAnagram("Mother In Law", "Hitler Woman");

    }
}
