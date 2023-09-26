import java.util.Scanner;

public class matr {


    public static void add(int[][] a , int[][] b , int r , int c){
        int[][] sum = new int[10][10];
        // int r = a.length;
        // int c = a[0].length;

        for(int i =0;i<r;i++){;
            for(int j =0 ; j<c;j++){

                sum[i][j]= a[i][j] + b[i][j];

            }
        }

        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.println("array of postion"+ i +" :" + " j=" + sum[i][j] + " ");
            }
        }
    }

    public static void sub(int[][] a , int[][] b , int r , int c){
        int[][] sub = new int[10][10];
        // int r = a.length;
        // int c = a[0].length;

        for(int i =0;i<r;i++){
            for(int j =0 ; j<c;j++){

                sub[i][j]= a[i][j] - b[i][j];

            }
        }

        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.println("array of postion"+ i +" :" + " j=" + sub[i][j] + " ");
            }
        }
    }

    public static void mul(int[][] a , int[][] b , int r , int c){
        int[][] mul = new int[10][10];
        // int r = a.length;
        // int c = a[0].length;

        for(int i =0;i<r;i++){
            for(int j =0 ; j<c;j++){

                mul[i][j]= a[i][j] * b[i][j];

            }
        }

        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.println("array of postion"+ i +" :" + " j=" + mul[i][j] + " ");
            }
        }

        
    }

    public static void div(int[][] a , int[][] b , int r , int c){
        int[][] div = new int[10][10];
        // int r = a.length;
        // int c = a[0].length;

        for(int i =0;i<r;i++){
            for(int j =0 ; j<c;j++){

                div[i][j]= a[i][j] / b[i][j];

            }
        }

        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.println("array of postion"+ i +" :" + " j=" + div[i][j] + " ");
            }
        }

        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a;
        int[][] b;
        a = new int[10][10];
        b = new int[10][10];
        System.out.println("enter the rows");
        int r = sc.nextInt();
        System.out.println("enter the colunms");
        int c = sc.nextInt();
        System.out.println("first aaary");
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.println(i + ": " + j);
                a[i][j]= sc.nextInt();

            }
            
        }
        System.out.println("second aaray");

        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.println(i + " : " + j);
                b[i][j]= sc.nextInt();

            }
            
        }

        System.out.println("first aaray --");

        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.print("array of position "+ i +" : " + j +"=" +a[i][j] + " ");
                System.out.print("\n");

            }
            
        }
        System.out.println("--------");

        System.out.println("second array");

        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                // System.out.println(System.out.print("aarsy no"+ i +" :" + " j=" +b[i][j] + " "));
                System.out.println("array of position "+ i +" : " + j + "=" +b[i][j] + " ");
                System.out.print("\n");

            }
            
        }

        System.out.println("addtion");
        System.out.println();

        add(a, b,r,c);

        System.out.println("subtraction");
        System.out.println();

        sub(a, b, r, c);

        System.out.println("multiplication");
        System.out.println();

        mul(a, b, r, c);

        System.out.println("division");
        System.out.println();

        div(a, b, r, c);

        // System.out.println(Arrays.toString(a));
    }
}
