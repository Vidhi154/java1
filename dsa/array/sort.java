import java.util.Arrays;
import java.util.Scanner;

public class sort {

    public static String ser(int[] array , int len){
        // int temp=0;
        boolean swap;
        do{
            swap=false;
        for(int i =0;i<len-1;i++){
            int temp=0;
            if(array[i]>array[i+1]){
                temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
                swap = true;
            }


        }
    }while(swap);
   
        return Arrays.toString(array);

    }
    public static void main(String[] args) {
        int arry[] = new int[10];
        int len =7;
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<len;i++){
            arry[i] = sc.nextInt();

        }

        System.out.println(Arrays.toString(arry));
        ser(arry,len);
        System.out.println(Arrays.toString(arry));
        for(int i =0;i<len;i++){
            System.out.println(arry[i]+ "\n");
        }


    }
}
