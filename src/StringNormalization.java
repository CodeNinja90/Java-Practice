public class StringNormalization {


    public static void main(String[] args) {

        String s = "My  Name is @$$H0le";


/*

        String ns=s.toLowerCase().replaceAll("[^a-z0-9]", "");

        System.out.println(ns);*/


        String ps = s;

        String ns  = "";

        String rns = "";



        ns   = ps.toLowerCase().replaceAll("[^a-z0-9]","");
        rns  = new StringBuilder(ns).reverse().toString();

        if (ns.equals(rns)){

            System.out.println(true);
        }

        else
            System.out.println(false);







    }


}
