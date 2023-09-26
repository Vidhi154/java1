import java.util.Arrays;

public class twod {
    public static void main(String[] args) {
        int row=4;
        int col=5;
        int[][] ary = new int[row][col];
        int value =1;
        for(int i =0;i<row;i++){
            for(int j =i;j<col;j++){
                ary[i][j]=value;
                value++;

            
            }
            
        }
        for(int i =0;i<row;i++){
            for(int j =i;j<col;j++){
                System.out.println(ary[i][j]+ " ");

            
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(ary));
    
    
}
}