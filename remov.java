import java.util.Arrays;

public class remov {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        int num = 6;
        int temp = a[2];
        for(int i =3;i<num-1;i++){
            a[i]=a[i+1];
            // a[num-1]=0;
            // num--;
        }
        a[num-1]=0;
            // num--;
        // a[5]=(Integer) null;
        System.out.println(Arrays.toString(a));
        System.out.println(temp);

    }
}
