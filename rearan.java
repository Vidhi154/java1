import java.util.Arrays;

public class rearan {

    public static void rear(int[] ary, int ln){
        Arrays.sort(ary);
        boolean swap;
        System.out.println(Arrays.toString(ary));
        do{
            swap= false;

        
        for(int i =0; i<ln;i++){
            int temp =0;
            if((i%2)==0){
                temp=ary[i];
                ary[i]=ary[ln-1];
                ary[ln-1]=temp;
                swap=true;
            }
        }
        ln--;
    }while(swap);
    }
    public static void main(String[] args) {

        int[] ary = {2,13,55,35,3,27};
        int len = ary.length;
        rear(ary, len);
        System.out.println(Arrays.toString(ary));
        
    }
}
