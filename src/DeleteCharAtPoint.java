// Delete character at a point

public class DeleteCharAtPoint {


    public static void delchar(String s, int n){


        System.out.println(s.substring(0,n) + s.substring(n+1));


    }


    public static void main(String[] args) {

        String j = "TheName is Bond";

        delchar (j, 5);
    }
}
