public class SwapNumbers_2var {


    public static void main(String[] args) {

        int x = 50 ; int y = 40;


         x = x + y ; // creating a combined value and assigning it to x | x = 90 y =40

        y = x - y ; // Removing y value 40 from the combined value , we get original value of x , 50. Assigning it to y | y = 50 , x = 90

        x = x - y ; // Removing original value of x (50) from combined value to get original value of y(40) , and assigning it to x


        System.out.println(x +"  "+y);


    }
}
