package dsa.array.arays;
class min{
public static int mami(int[] arry,int n){
    int small = 0;
    int ind= arry[0];

    for(int ea : arry){
        if(arry[ea]<ind){
            small=ea;
            ind=arry[ea];
        }
    }
    return small;
}
}
public class minmax {
    public static void main(String[] args) {
        int[] array = {3,5,22,45};
        mami(array,4);
        
    }

    private static void mami(int[] array, int i) {
    }
}
