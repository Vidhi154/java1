import java.util.Scanner;

public class ini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                arr[i][j]=i+j;
            }
        }

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }


        
    }
}