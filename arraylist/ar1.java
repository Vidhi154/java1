import java.util.ArrayList;
import java.util.Arrays;

public class ar1{
    public static void main(String[] args) {
        int n =5;
        //size of an array list

        ArrayList<Integer> arl = new ArrayList<Integer>(n);
        // initialize 

        ArrayList<Integer> ar2= new ArrayList<Integer>();
        //declare

        System.out.println("array 1 " + arl);
        System.out.println("array 2" + ar2);

        for(int i =0;i<n;i++){
            arl.add(i);
            // arl.get()
            arl.iterator();
            ar2.add(i*2);

        }

        System.out.println(arl + " " + ar2);
        arl.iterator();

        // System.out.println(Arrays.deepToString(arl));
    }
}