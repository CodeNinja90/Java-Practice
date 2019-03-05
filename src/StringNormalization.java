public class StringNormalization {


    public static void main(String[] args) {

        String s = "My  Name is N@r3$H";




        String ns=s.toLowerCase().replaceAll("[^a-z0-9]", "");

        System.out.println(ns);


    }


}
