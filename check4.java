import java.util.Arrays;

public class check4{


    public static void ceh(int[] ary, int len){
        boolean swap;
        int count=0;
        int temp;
        do{
            swap= false;
            for(int i=0;i<len-1;i++){
                temp=0;
                if(ary[i]==0){
                    temp=ary[i];
                    ary[i]=ary[i+1];
                    ary[i+1]=temp;
                    swap= true;
                }
            }
        }while(swap);

        System.out.println(Arrays.toString(ary));

    }
    public static void main(String[] args) {
        int[] aray= { 1,0,3,0,5,2,0,11};
        int len = aray.length;
        ceh(aray, len);
        
    }
}