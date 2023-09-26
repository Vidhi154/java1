import java.util.Arrays;

public class sapp {
    public static void swapp(int first,int last){
        if(last<=first){
            return ;
        }
        int temp =0;
        temp= first;
        first = last;
        last = temp;
        swapp(first+1,last-1);
    

    }
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        int first=a[0];
        int len = a.length;
        int last=a[len-1];
        swapp(first, last);
        System.out.println(Arrays.toString(a));

    }
}
