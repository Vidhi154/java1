public class pain {
    public static void main(String[] args) {
        int n= 5;
        int first =0;
        int second =1;
        for(int i =0;i<n;i++){
            System.out.print(first + " ");
            int temp = first + second;
            first = second;
            second = temp;

        }
        // System.out.println();
    }
    
}