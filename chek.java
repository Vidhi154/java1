import java.util.Arrays;

public class chek {

    public static void checkk(int[] arry, int len){
        int count=0;
        int chek;
        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));
        for(int i =1;i<len;i++){
            chek=0;
            if(count<3){
            // check=0;
            System.out.println(arry[len-i]);
            count++;
            }
        }
    }
    public static void main(String[] args) {

        int[] arr= {12,5,3,52,67,7,2};
        int len = arr.length;
        checkk(arr,len);
        
    }

}
