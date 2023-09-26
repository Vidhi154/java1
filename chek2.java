import java.util.Arrays;

public class chek2 {
    public static void main(String[] args) {
        int[] ary = { 1,3,12,46,23,23,4,2,6};
        Arrays.sort(ary);
        int largest= Math.max(34,75);
        System.out.println(largest);
        int n = ary.length;
        boolean swap;
        do{
            

        swap = false;
        for(int i =0;i<n-1;i++){
            if(ary[i]==ary[i+1]){
                swap=true;
                System.out.println(ary[i] + " " + ary[i+1]);
                



            }
            break;
            // System.out.println(ary[i] + " " + ary[i+1]);

        }
        }while(swap);


        for(int i=ary.length-2;i>=0;i--){
            if(ary[i]!=ary[i-1]){
                System.out.println(ary[i]);
                break;
            }else{
                System.out.println("not have second largest ");
                break;
            }
        }



        // if(ary[n-2]!=ary[n-1]){
        //     System.out.printSln(ary[n-2]);

        // }
        // System.out.println(ary[n-2]);
        // System.out.println(first);
    }
}
