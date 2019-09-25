
import java.util.*;


public class BinarySearch {









        public static void main(String[] args) {
            //Create list
            ArrayList<Integer> arrlist = new ArrayList<Integer>();
            arrlist.add(10);
            arrlist.add(60);
            arrlist.add(30);
            arrlist.add(20);
            arrlist.add(50);
            //Print List

            Collections.sort(arrlist); // Always make sure the list is sorted, or binary search wont work as intended

            System.out.println("Provided List are: "+arrlist);
            int index = Collections.binarySearch(arrlist, 60);
            System.out.println("Index  is available at position: "+index);



        }

}
