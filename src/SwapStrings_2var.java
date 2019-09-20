public class SwapStrings_2var {

    public static void main(String[] args) {

        String a = "Love";
        String b = "You";

        a = a + b; // combining the values | a length 7 , b length 3

        // Total length (7) - b length (3) , gives you original length of a (4), start from beginning to separate origina a , and assign it to b
        b = a.substring(0, a.length() - b.length());
        // get the length of b , to find a original length . Start from the ending point of a , till rest of the string to extract original b and assign it to a
        a = a.substring(b.length());

        System.out.println("After swapping: " + a + " " + b);
    }
}