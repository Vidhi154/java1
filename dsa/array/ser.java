package dsa.array;

import java.util.Arrays;
import java.util.Scanner;

//import org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14N11Method;

// public class ser {
    public static void serac(int[] array , int item){
        int small = array[0];
        int small_index =0;
        for(int ea: array){
            if(array[ea]<small){
                small=array[ea];


            }
        }
        return small_index ;
    }
public class ser {
    public static void main(String[] args) {
        int[] arry= new int[5];
        Scanner sc = new Scanner(System.in);
        int len=6;
        for(int i =0;i<len;i++){
            arry[i]=sc.nextInt();


        }
        System.out.println(Arrays.toString(arry));
        System.out.println("search an item is :");
        int n = sc.nextInt();


        int result =serac(arry,n);
        System.out.println(result);

    }
}

