import java.util.Arrays;

public class copyoff {
    public static void main(String[] args) {
        int[] ary = new int[] {1,2,3,4,5,6};
        System.out.println("print the orignal array: " );
        // for(int i =0;i<ary.length;i++){
            System.out.println(Arrays.toString(ary));
        
        int[] coary = Arrays.copyOf(ary, 10);
        coary[6]=23;
        coary[7]=65;
        System.out.println(Arrays.toString(coary));

        Arrays.fill(ary,3,5, 6);
        System.out.println(Arrays.toString(ary));

        System.out.println(Arrays.asList(coary));
        System.out.println(Arrays.toString(coary));
        Arrays.binarySearch(null, 0, 0, null, null)







    }
    
}
