import java.util.Arrays;

public class insertt {

    public static void ine(int[] a, int ele,int item){
        int o;
        int len = a.length-1;
        for(int i=len;i<=ele;i++){
        a[len+1]=a[len];

        }
        
        a[ele]=item;
        len++;
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int array[] ={12,34,24,542,43,23};

        // array={12,34,24,542,43,23};

        ine(array,3,54);


    }
}
